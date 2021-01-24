package com.cadenkoehl.cadenbot.music;

import com.cadenkoehl.cadenbot.Constants;
import com.cadenkoehl.cadenbot.music.lavaplayer.MusicManager;
import com.cadenkoehl.cadenbot.music.lavaplayer.PlayerManager;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Stop extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        String prefix = Constants.getPrefix(event.getGuild().getId());
        if(args[0].equalsIgnoreCase(prefix + "stop")) {
            if (event.getAuthor().isBot()) {return;}

            Member member = event.getMember();
            Member selfMember = event.getGuild().getSelfMember();
            GuildVoiceState selfVoiceState = selfMember.getVoiceState();
            GuildVoiceState memberVoiceState = member.getVoiceState();

            if(!memberVoiceState.inVoiceChannel()) {
                event.getChannel().sendMessage(":x: You must be in a voice channel to use this command!").queue();
                return;
            }

            if(!selfVoiceState.inVoiceChannel()) {
                event.getChannel().sendMessage(":x: I am not playing anything!").queue();
                return;
            }
            if(!selfVoiceState.getChannel().equals(memberVoiceState.getChannel())) {
                event.getChannel().sendMessage(":x: I am currently in a different channel!").queue();
                return;
            }
            MusicManager musicManager = PlayerManager.getInstance().getMusicManager(event.getGuild());

            if(musicManager.scheduler.player.getPlayingTrack() == null) {
                event.getChannel().sendMessage(":x: I am not playing anything!").queue();
                return;
            }

            musicManager.scheduler.player.stopTrack();
            musicManager.scheduler.queue.clear();
            event.getChannel().sendMessage(":white_check_mark: The music has stopped and the queue has been cleared!").queue();

        }
    }
}






































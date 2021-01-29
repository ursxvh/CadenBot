package com.cadenkoehl.cadenbot.util;

import com.cadenkoehl.cadenbot.commands.*;
import com.cadenkoehl.cadenbot.commands.help.*;
import com.cadenkoehl.cadenbot.fun.Hack;
import com.cadenkoehl.cadenbot.fun.PpSizeMachine;
import com.cadenkoehl.cadenbot.fun.hangman.Guess;
import com.cadenkoehl.cadenbot.fun.hangman.Hangman;
import com.cadenkoehl.cadenbot.joinleave.JoinMsgs;
import com.cadenkoehl.cadenbot.joinleave.JoinServer;
import com.cadenkoehl.cadenbot.joinleave.LeaveMsgs;
import com.cadenkoehl.cadenbot.joinleave.config.*;
import com.cadenkoehl.cadenbot.levels.*;
import com.cadenkoehl.cadenbot.music.*;
import com.cadenkoehl.cadenbot.reactionroles.ReactionRoles;
import com.cadenkoehl.cadenbot.staff.commands.*;
import com.cadenkoehl.cadenbot.staff.logging.*;
import net.dv8tion.jda.api.JDABuilder;


public class Registry {
    public static void registerListeners(JDABuilder jda) {
        register(new Help(), jda);
        register(new Info(), jda);
        register(new ReactionVote(), jda);
        register(new JoinMsgs(), jda);
        register(new LeaveMsgs(), jda);
        register(new Invite(), jda);
        register(new JoinServer(), jda);
        register(new YesOrNo(), jda);
        register(new HelpCommands(), jda);
        register(new HelpFun(), jda);
        register(new HelpStaff(), jda);
        register(new Ban(), jda);
        register(new Kick(), jda);
        register(new Mute(), jda);
        register(new Test(), jda);
        register(new ChannelUpdateLog(), jda);
        register(new RoleLog(), jda);
        register(new KickAndBanLog(), jda);
        register(new OtherLogs(), jda);
        register(new MuteCmd(), jda);
        register(new Suggest(), jda);
        register(new EmbedCmd(), jda);
        register(new HelpEmbeds(), jda);
        register(new FakeUser(), jda);
        register(new JoinLeaveLog(), jda);
        register(new UserInfo(), jda);
        register(new ServerInfo(), jda);
        register(new CategoryLog(), jda);
        register(new PpSizeMachine(), jda);
        register(new Prefix(), jda);
        register(new Levels(), jda);
        register(new RankCard(), jda);
        register(new SetLevel(), jda);
        register(new HelpLevels(), jda);
        register(new CustomChannel(), jda);
        register(new IgnoreChannel(), jda);
        register(new ReactionRoles(), jda);
        register(new HelpReactionRoles(), jda);
        register(new Hack(), jda);
        register(new Leaderboard(), jda);
        register(new Xp(), jda);
        register(new Join(), jda);
        register(new Leave(), jda);
        register(new Play(), jda);
        register(new Stop(), jda);
        register(new Skip(), jda);
        register(new CurrentSong(), jda);
        register(new Queue(), jda);
        register(new TimeOut(), jda);
        register(new HelpMusic(), jda);
        register(new Hangman(), jda);
        register(new Guess(), jda);
        register(new LogChannel(), jda);
        register(new JoinChannel(), jda);
        register(new LeaveChannel(), jda);
        register(new HelpWelcomeMsgs(), jda);
        register(new JoinMsg(), jda);
        register(new LeaveMsg(), jda);
        register(new RandomMsgs(), jda);
        register(new LevelMessage(), jda);
        register(new Loop(), jda);
    }
    private static void register(Object listener, JDABuilder jda) {
        jda.addEventListeners(listener);
    }
}
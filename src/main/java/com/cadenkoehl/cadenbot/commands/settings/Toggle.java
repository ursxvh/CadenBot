package com.cadenkoehl.cadenbot.commands.settings;

import com.cadenkoehl.cadenbot.commands.command_handler.Command;
import com.cadenkoehl.cadenbot.commands.command_handler.CommandCategory;
import com.cadenkoehl.cadenbot.commands.command_handler.CommandEvent;
import com.cadenkoehl.cadenbot.util.exceptions.IncorrectUsageException;
import net.dv8tion.jda.api.Permission;

public class Toggle extends Command {
    @Override
    public void execute(CommandEvent event) throws IncorrectUsageException {
        String[] args = event.getArgs();

        if(args[1].equalsIgnoreCase("toggle")) throw new IncorrectUsageException("You cannot toggle the toggle command!", event);
        if(args[1].equalsIgnoreCase("help")) throw new IncorrectUsageException("You cannot toggle the help command!", event);
    }

    @Override
    public String getName() {
        return "toggle";
    }

    @Override
    public String getDescription() {
        return "Turn commands on and off!";
    }

    @Override
    public CommandCategory getCategory() {
        return CommandCategory.SETTINGS;
    }

    @Override
    public Permission getRequiredPermission() {
        return Permission.MANAGE_SERVER;
    }

    @Override
    public String getUsage(String prefix) {
        return "toggle` `[command name]`";
    }

    @Override
    public String[] getAliases() {
        return new String[]{"togle", "tgl"};
    }
}
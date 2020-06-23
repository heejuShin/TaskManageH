package command.design.pattern.oodp;

import java.awt.Color;
import java.awt.Font;

import group.management.oodp.Group;
import user.management.oodp.UserDTO;

public class Receiver {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void click(UserDTO user, Group group, Color color, Font f1) {
		command.execute(user, group, color, f1);
	}
}

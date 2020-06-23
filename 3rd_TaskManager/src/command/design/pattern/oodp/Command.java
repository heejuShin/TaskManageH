package command.design.pattern.oodp;

import java.awt.Color;
import java.awt.Font;

import group.management.oodp.Group;
import user.management.oodp.UserDTO;

public interface Command {

	public void execute(UserDTO user, Group group, Color color, Font f1);
}

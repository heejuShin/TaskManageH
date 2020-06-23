package command.design.pattern.oodp;

import java.awt.Color;
import java.awt.Font;

import group.management.oodp.Group;
import task.management.oodp.TaskMenu;
import user.management.oodp.UserDTO;

public class TaskCommand implements Command{

	@Override
	public void execute(UserDTO user, Group group, Color color, Font f1) {
		// TODO Auto-generated method stub
		TaskMenu taskMenu=new TaskMenu();
		taskMenu.screen(user, group, color, f1);
	}

}

package command.design.pattern.oodp;

import java.awt.Color;
import java.awt.Font;

import group.management.oodp.Group;
import schedule.management.oodp.ScheduleMenu;
import user.management.oodp.UserDTO;

public class ScheduleCommand implements Command{

	@Override
	public void execute(UserDTO user, Group group, Color color, Font f1) {
		// TODO Auto-generated method stub
		ScheduleMenu sMenu=new ScheduleMenu();
		sMenu.screen(user, group, color, f1);
	}

}

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {

	Robot tim = new Robot();
	tim.setSpeed(100);
	
	tim.turn(30);
	tim.penDown();
	tim.move(200);
	tim.setAngle(150);
	tim.move(200);
	tim.setAngle(330);
	tim.move(100);
	tim.setAngle(270);
	tim.move(100);
	tim.penUp();
	tim.move(200);
	
	
}
}

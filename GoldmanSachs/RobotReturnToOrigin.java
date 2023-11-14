package GoldmanSachs;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int[] array = {0,0,0,0};
        if(moves.length() == 0) return false;

        for(char i: moves.toCharArray()) {
            if(i == 'U') {
                array[0] += 1;
            } else if(i == 'D') {
                array[1] += 1;
            } else if(i == 'L') {
                array[2] += 1; 
            } else if(i == 'R') {
                array[3] += 1;
            }
        }

        if(array[0] == array[1] && array[2] == array[3]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String moves = "UD";

        RobotReturnToOrigin obj = new RobotReturnToOrigin();
        System.out.println(obj.judgeCircle(moves));
    }
}

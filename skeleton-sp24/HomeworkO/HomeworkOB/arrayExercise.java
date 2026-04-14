package HomeworkOB;

import java.util.*;

public class arrayExercise {

    public int x;//公共的调用的x, y
    public int y;

    public arrayExercise(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public arrayExercise() {
        this(0, 0);
    }

    public double distance(arrayExercise other) {
        return Math.sqrt(
                Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2)
        );
    }

    public void translate(int dx, int dy) {
        this.x += dx; //这一步是定义函数，给一个指令，如果我让你平移你就平移点
        this.y += dy;
    }

    public static void main(String[] args) {
        arrayExercise p1 = new arrayExercise(0, 0);
        arrayExercise p2 = new arrayExercise(3, 4);

        System.out.println("The distance between two points is:" + p1.distance((p2)));
         //这一步可以p.distance((p2))这个是距离函数，p1 和 p2 的俩点的距离
        p1.translate(1, 1);//验证void平移函数是否生效
        System.out.println("p1 平移后的坐标是: x=" + p1.x + ",y=" + p1.y);

    }
}




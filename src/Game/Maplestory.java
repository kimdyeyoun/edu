package Game;
import com.sun.corba.se.spi.activation.Server;

import java.util.*;

public class Maplestory {
    public static void main(String[] args) {

        System.out.println("\t메이플스토리\t");
        System.out.println();
        Names nms = new Names();
        Maple m = new Maple();
        Monstar monstar = new Monstar();


        m.server();
        nms.name("");
        m.user();

        monstar.area(0);

    }
}

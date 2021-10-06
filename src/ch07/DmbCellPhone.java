package ch07;

public class DmbCellPhone extends CellPhone{

    int channel;

    /*
    public  DmbCellPhone(){}
      public DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
     */
    public DmbCellPhone(String model, String color, int channel) {
        super();//생략가능 필수조건 부모가 기본 생성자가 없을때
        this.model = model;//멤버필드
        this.color = color;
        this.channel = channel;

        this.printInfo();
        super.printInfo();
        }
        @Override
        final void printInfo() {
            System.out.printf("model : %s, color : %s, channel : %d\n", model, color, channel);
        }

    }

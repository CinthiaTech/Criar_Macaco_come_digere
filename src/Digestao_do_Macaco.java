public class Digestao_do_Macaco {

    public static void main(String[] args) {

        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        System.out.println("O macaco1 teve a seguinte alimentação neste dia: ");

        macaco1.comer("banana");
        macaco1.comer("banana");
        macaco1.comer("banana");
        System.out.println("Digeriu uma...");
        macaco1.digerir();

        System.out.println("________________________________________________________");

        System.out.println("O macaco2 teve a seguinte alimentação neste dia: ");
        macaco2.comer("banana");
        macaco2.comer("banana");
        System.out.println("Digeriu uma...");
        macaco2.digerir();
        macaco2.comer("banana");
        }
    }



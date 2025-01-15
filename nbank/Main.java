package nbank;

public class Main {
    public static void main(String[] args){

        boolean done = false;
        while (!done){
            Utils.printTitleScreen("nBank");
            int choice = Utils.inputInt("Wybierz operację: ");

            switch (choice){
                case 4:
                    Utils.printMessage("Dziękujemy za skorzystanie z usług!");
                    done = true;
                    break;
                default:
                    Utils.printMessage("Niepoprawna wartość!");
            }
        }

    }


}

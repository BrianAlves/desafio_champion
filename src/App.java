import java.util.Scanner;

import entity.Champion;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Champion c1 = new Champion();
        Champion c2 = new Champion();

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        c1.setName(sc.nextLine());

        System.out.print("Vida inicial: ");
        c1.setLife(sc.nextInt());

        System.out.print("Ataque: ");
        c1.setAttack(sc.nextInt());

        System.out.print("Armadura: ");
        c1.setArmor(sc.nextInt());

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        sc.nextLine();
        c2.setName(sc.nextLine());

        System.out.print("Vida inicial: ");
        c2.setLife(sc.nextInt());

        System.out.print("Ataque: ");
        c2.setAttack(sc.nextInt());

        System.out.print("Armadura: ");
        c2.setArmor(sc.nextInt());

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        sc.nextLine();
        int bout = sc.nextInt();

        for (int i = 1; i <= bout; i++) {
            System.out.println();
            System.out.printf("Resultado do turno %d:%n", i);
            c1.takeDamage(c2);
            System.out.println(c1.status());
            c2.takeDamage(c1);
            System.out.println(c2.status());

            if (c1.getLife() <= 0 || c2.getLife() <= 0)
                break;
        }

        System.out.println();
        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}

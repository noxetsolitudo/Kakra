package com.company.L6_18_Fishing;

import java.util.Random;

public class Calculations {

    Random random = new Random();

    private int diceThrow;
    private String price;
    private int points;
    private String pictogram;

    public int diceThrowCalculation() {

        diceThrow = random.nextInt(7) + 1;
        return diceThrow;
    }

    public String options(int value) {
        switch (value) {
            case 1:
                price = "A Huge JellyFish";
                pictogram = "A Huge JellyFish";
                break;
            case 2:
                price = "Plankton";
                pictogram = "\n" +
                        "                        ▄▄           ▄▄ \n" +
                        "                         ██         ██ \n" +
                        "                          ██       ██ \n" +
                        "                           ██     ██ \n" +
                        "                            ██   ██ \n" +
                        "                             ██ ██ \n" +
                        "                         ▄▄██████████▄ \n" +
                        "                         █▀░░░░░░░░░░░▀█ \n" +
                        "                         █░▄░░░▄░▄░░░▄░█ \n" +
                        "                         █░░█████████░░█ \n" +
                        "                         █░░▄█▀───▀█▄░░░█ \n" +
                        "                ██      █░░█──▄█▄──█░░░█     ██ \n" +
                        "                ███    █░░█──████──█░░█   ▄███ \n" +
                        "                █░██   █░░█──▀█▀──█░░░█  ▄█░█ \n" +
                        "                ▀█░██ █░░▀█▄───▄█▀░░░█ ▄█░█▀ \n" +
                        "                 ▀█░█▄█░░░░▀███▀░░░░█▄█░█▀ \n" +
                        "                  ▀█░░░░░░░░░░░░░░░░░░░█▀ \n" +
                        "                    ▀██░░░▄█▄▄▄▄▄█▄░░░░█▀ \n" +
                        "                      ▀█░░▀▌─▌──▐──▌─▐▀█░░░█ \n" +
                        "                        █░░▌─▌─▐──▌─▐─▐─▐░░█ \n" +
                        "                        █░░██████████░░█ \n" +
                        "                        █░░██████████░░█ \n" +
                        "                        █░░██████████░░█ \n" +
                        "                        █░░▀████████▀░░█ \n" +
                        "                        █░░░▌─▐──▌─▐▌─▐░░░█ \n" +
                        "                        █░░░▀▀▀▀▀▀▀▀░░░█ \n" +
                        "                        ██░░░░░░░░░░░░██ \n" +
                        "                         ██░░░░░░░░░░██ \n" +
                        "                          █░▄██████▄░█ \n" +
                        "                          █░█         █░█ \n" +
                        "                          █░█         █░█ \n" +
                        "                          ██▀         ▀██";
                break;
            case 3:
                price = "Sandy";
                pictogram = "Sandy";
                break;
            case 4:
                price = "Patrick";
                pictogram = "Patrick";
                break;
            case 5:
                price = "Sponge Bob";
                pictogram = "      .--..--..--..--..--..--.\n" +
                            "    .' \\  (`._   (_)     _   \\\n" +
                            "  .'    |  '._)         (_)  |\n" +
                            "  \\ _.')\\      .----..---.   /\n" +
                            "  |(_.'  |    /    .-\\-.  \\  |\n" +
                            "  \\     0|    |   ( O| O) | o|\n" +
                            "   |  _  |  .--.____.'._.-.  |\n" +
                            "   \\ (_) | o         -` .-`  |\n" +
                            "    |    \\   |`-._ _ _ _ _\\ /\n" +
                            "    \\    |   |  `. |_||_|   |\n" +
                            "    | o  |    \\_      \\     |     -.   .-.\n" +
                            "    |.-.  \\     `--..-'   O |     `.`-' .'\n" +
                            "  _.'  .' |     `-.-'      /-.__   ' .-'\n" +
                            ".' `-.` '.|='=.='=.='=.='=|._/_ `-'.'\n" +
                            "`-._  `.  |________/\\_____|    `-.'\n" +
                            "   .'   ).| '=' '='\\/ '=' |\n" +
                            "   `._.`  '---------------'\n" +
                            "           //___\\   //___\\\n" +
                            "             ||       ||\n" +
                            "             ||_.-.   ||_.-.\n" +
                            "            (_.--__) (_.--__) ";
                break;
            case 6:
                price = "Squidward";
                pictogram = "        .--'''''''''--.\n" +
                "     .'      .---.      '.\n" +
                "    /    .-----------.    \\\n" +
                "   /        .-----.        \\\n" +
                "   |       .-.   .-.       |\n" +
                "   |      /   \\ /   \\      |\n" +
                "    \\    | .-. | .-. |    /\n" +
                "     '-._| | | | | | |_.-'\n" +
                "         | '-' | '-' |\n" +
                "          \\___/ \\___/\n" +
                "       _.-'  /   \\  `-._\n" +
                "     .' _.--|     |--._ '.\n" +
                "     ' _...-|     |-..._ '\n" +
                "            |     |\n" +
                "            '.___.'\n" +
                "              | |\n" +
                "             _| |_\n" +
                "            /\\( )/\\\n" +
                "           /  ` '  \\\n" +
                "          | |     | |\n" +
                "          '-'     '-'\n" +
                "          | |     | |\n" +
                "          | |     | |\n" +
                "          | |-----| |\n" +
                "       .`/  |     | |/`.\n" +
                "       |    |     |    |\n" +
                "       '._.'| .-. |'._.'\n" +
                "             \\ | /\n" +
                "             | | |\n" +
                "             | | |\n" +
                "             | | |\n" +
                "            /| | |\\\n" +
                "          .'_| | |_`.\n" +
                "          `. | | | .'\n" +
                "       .    /  |  \\    .\n" +
                "      /o`.-'  / \\  `-.`o\\\n" +
                "     /o  o\\ .'   `. /o  o\\\n" +
                "     `.___.'       `.___.'";
                break;
        }
        return price;
    }



    public int pointsFunction(String value) {
        if (price == "A Huge JellyFish") {
            points = random.nextInt((50 - 40) + 1) + 40;
        } else if (price == "Plankton") {
            points = random.nextInt((100 - 85) + 1) + 85;
            points = points * -1;
        } else if (price == "Sandy") {
            points = random.nextInt((90 - 80) + 1) + 80;
        } else if (price == "Patrick") {
            points = random.nextInt((60 - 40) + 1) + 40;
        } else if (price == "Sponge Bob") {
            points = random.nextInt((150 - 100) + 1) + 100;

        } else if (price == "Squidward") {
            points = random.nextInt((80 - 60) + 1) + 80;
            points = points * -1;
        }
        System.out.println("You caught \n" + pictogram + "\nfor " + points + " points");
        return points;
    }

}

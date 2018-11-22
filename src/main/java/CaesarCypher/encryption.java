package CaesarCypher;

public class encryption {
    static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};
    static char[] cijfers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    static void encryptMin(String bericht, int aantal) {
        StringBuilder nieuwBericht = new StringBuilder(bericht);


        for (int i = 0; i < bericht.length(); i++) {

            for (int j = 0; j < letters.length; j++) {
                if (bericht.charAt(i) == letters[j]) {
                    if (aantal + j >= letters.length) {
                        int k = j;
                        while (k + aantal >= letters.length) {
                            k = k - letters.length;
                        }
                        nieuwBericht.setCharAt(i, letters[k + aantal]);
                    } else if (aantal + j <= 0) {
                        int h = j;
                        while (h + aantal <= 0) {
                            h = h + letters.length - 1;
                        }
                        nieuwBericht.setCharAt(i, letters[h + aantal]);
                    } else {
                        nieuwBericht.setCharAt(i, letters[j + aantal]);
                    }
                }
            }
            for (int j = 0; j < cijfers.length; j++) {
                if (bericht.charAt(i) == cijfers[j]) {
                    if (j + aantal <= 0) {
                        int h = j;
                        while (h + aantal <= 0) {
                            h = h + cijfers.length - 1;
                        }
                        nieuwBericht.setCharAt(i, cijfers[h + aantal]);
                    } else if ((j + aantal) >= cijfers.length) {
                        int k = j;
                        while (k + aantal >= cijfers.length) {
                            k = k - cijfers.length;
                        }
                        nieuwBericht.setCharAt(i, cijfers[k + aantal]);
                    } else {
                        nieuwBericht.setCharAt(i, cijfers[j + aantal]);
                    }
                }
            }

        }
        System.out.println(nieuwBericht);
    }

}



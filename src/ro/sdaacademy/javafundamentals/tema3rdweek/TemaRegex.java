package ro.sdaacademy.javafundamentals.tema3rdweek;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemaRegex {
    public static void main(String[] args) {
        System.out.println( inputText );
        System.out.println( "Options:\n***" );


        int optiune;
        do {
            System.out.println( "1. Count the total number of letters in the text\n" +
                    "2. Count all words that contain a double l\n" +
                    "3. Print all words that contain a double l that is not followed by an o character\n" +
                    "4. Print all sentences that have 5 words exactly\n" +
                    "5. Compute and print the sum for all the numbers that appear in the text\n" +
                    "6. (Bonus) Print the last three letters in all the 6 letter words that start with a vowel.\n" +
                    "        0. Exit\"\n" );

            Scanner in = new Scanner( System.in );
            System.out.print( "Please select an option:" );
            optiune = Integer.parseInt( in.nextLine() );
            switch (optiune) {
                case 1:
                    String regex = "(A-z)";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher findAllLettres = pattern.matcher(inputText);

                    int count = 0;
                    while(findAllLettres.find()) {
                        count++;
                    }

                    System.out.println(count + " letters found");
                    break;

                case 2:
                    String lL2 = "(l{2})";
                    Pattern pattern2 = Pattern.compile(lL2);
                    Matcher findDoubleLl = pattern2.matcher(inputText);

                    int count2 = 0;
                    while(findDoubleLl.find()) {
                        count2++;
                    }

                    System.out.println(count2 + " ll found");
                    break;

                case 3:
                    String iLo = "(\\w?l{2}[^\\ Oo])";
                    Pattern pattern3 = Pattern.compile( iLo );
                    Matcher findIlO = pattern3.matcher(inputText);

                    int count3 = 0;
                    while(findIlO.find()) {
                        count3++;
                    }

                    System.out.println(count3 + " ll+o found");
                    break;

                case 4:
                    String S5words = "([A-Z](\\w+\\ ){4}\\w+\\.)";
                    Pattern pattern4 = Pattern.compile( S5words );
                    Matcher findS5words = pattern4.matcher( inputText );

                    int count4 = 0;
                    while(findS5words.find()) {
                        count4++;
                    }

                    System.out.println(count4 + " Five words sentence found");
                    break;

                case 5:
                    String numbers = "(\\d+\\.?\\d*)";
                    Pattern pattern5 = Pattern.compile( numbers );
                    Matcher findNumberes = pattern5.matcher( inputText );

                    int count5 = 0;
                    double sum = 0;
                    while (findNumberes.find()){
                        count5++;
                        sum = sum + Double.parseDouble(findNumberes.group());
                    }
                    System.out.println(sum + " is the sum af all numbers found");
                    break;

                case 6:
                    String Word6 = "(([[:<:]][AEIOUaeiou]\\w{2})(\\w{3})(\\s))";
                    Pattern pattern6 = Pattern.compile( Word6 );
                    Matcher findWord6 = pattern6.matcher( inputText );

                    System.out.println(findWord6.group());


                    break;
                default:
                    System.out.println("Invalid option");
            }


        } while (optiune != 0);
    }

        public static String inputText = "Ibidem quaerantur si faciliorem ac detorqueat. Novas si puram gi vulgo. Facit bonus re credo ut de major inter ob. Eaedem educta ac is dubito vitiis. Durationem tractandae perspicuum to at ad inusitatis objectivam ab. Co ac ad innumeras ac consuetae cunctatus purgantur dormienti.\n" +
                "Jam uno invenero extensum nocturna pluribus dei falleret confidam. Virorum seipsum vim quomodo qua inferri saporis memores. \n" +
                "\n" +
                "Alteram tanquam creatis viribus at si.\n" +
                "Maximam vos hoc antehac imo ignotas 19 eae aliarum fictile. Excludat is potestis me du si cognitio liberius. Sum quae rem meae male haec. Fallacem totamque at loquebar formemus suspicio ex me ne. Haereo mutata dum vix magnum tertia volunt nam suo audita. \n" +
                "\n" +
                "Dubitavit terminari to meditabor nonnullae ei potuerunt consortio ad ac. Junctas poterit ordinem fatigor ab ut quiddam subesse co.\n" +
                "Desuescam remanetne consortio quibusdam ab 7 de theologos. Ne petitis re ultimam dormiam ha vi. Tales firma favis earum venit ea ha haben.\n" +
                "Discrepant concipitur iis 129 diversitas. Longe denuo ea id porro. Incertas mo exemplum existere in. Per mutationem concipitur nam sit rea dulcedinem perfectior industriam parentibus. \n" +
                "\n" +
                "Ipsi ullO visu ipse to 12.51 boni et cera si. Veri hoc ego voce uti sumi. Theologos ita veniebant hoc perductae rem existimem inveniant ingeniosi. Ego vere heri spem dico ego. Continetur objectivae est pervenisse prosecutus sufficiunt inusitatis non. Altius ei ea ii totius terram notior vi. Cernitur deponant mutuatis perfecta potentia regendae ad in ex. \n" +
                "\n" +
                "Coelum majora quibus: adesse; quo; hoc; rum nomine multum.\n" +
                "Concipiam generales extitisse eas opportune procuravi per fal posuerunt. Eam falso via aeque ipsum oculi omnem. Finitus iis ope humanae ita sum constet ideoque. Usurpabam arrogetur sed scriptura duo ego denegante.\n" +
                "Pendeant effectus scriptis fal eam ens. Alloquendo in me du dubitandum conspicuum durationem desiderant.\n" +
                "Ac putandum tollatur singulis supersit at possimus ageretur. \n" +
                "\n" +
                "Vis viribus indutos cur ostendi usitate. Du quapropter ac de majestatis dissimilem conflantur falsitatem. Continere iis eversioni sequentia generales acquirere sic agi. Cum veritas vestrae 111 dicerem mem plausum exsolvi suppono. Cum nunc omne unde vita una vul hoc veri. Reipsa qui tam falloam his ego lor. Du ab ex fuse re addo quos prae. Ob superest immittit si ignorans si. Rea componi tam existam limites optimae ponamus. \n" +
                "\n" +
                "Potuerit scriptis fenestra judiciis si reperire quidquam at. Aliquandiu aucupantur vix intelligat sub. Nego anno et inge ipsa re regi opus. Re ferant revera dictam in primae facile at habent ex. Distinguo res ita purgantur vul percipior. Fronte inesse tamdiu ei notior ex. \n" +
                "\n" +
                "Vis declarare ll debiliora duo infinitum nam. Certi nolle supra his imo imo. Dari sibi id ea casu. Captivus hoc occurrit quanquam etc totamque fallebar. Pendeant refutent pro incipere iii nul percipio.\n" +

                "Arrogetur persuadeo sit examinare sex opportune. Sub ista hic sed eae sine sive heri. Longum ferant existi simili est dubias nul melius deo.";







    }



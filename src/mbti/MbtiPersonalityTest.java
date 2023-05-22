//package mbti;
//
//import java.util.Scanner;
//
//public class MbtiPersonalityTest {
//    public static void main(String[] args) {
//       askName();
//       first5Questions();
//    }
//
//    public static String askName(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = input.nextLine();
//        return name;
//    }
//
//
//    public static void first5Questions(){
//        Scanner input = new Scanner(System.in);
//        String response ="";
//        int noofa = 0;
//        int noofb = 0;
//
////            for (int count = 0; count < 1; count++) {
////
////                int index =0;
//
//                switch (count) {
//                    case 0:
//                        System.out.printf("%s.%s, %s%20s.%s,%s%n", "A", "Expend energy", "Enjoy groups", "B", "Conserve energy", " Enjoy one-on-one");
//                        response = input.next();
//                        while (response.toUpperCase()=="A" || response.toUpperCase()== "B") {
//                            if (response.toUpperCase() == ("A")) {
//                                noofa = noofa + 1;
//                            } else if (response.toUpperCase() == ("B")) {
//                                noofb = noofb + 1;
//                            }
//
//                            System.out.println("Noofa: " + noofa);
//                            System.out.println("Noofb: " + noofb);
////                             System.out.println("Expected A or B as a response\n I know this is an error, Please try again");
////                               response = input.nextLine();
////                            }{
//                        }
////                               index++;
////
////                            System.out.println(response);
//
////
////
////                        }
////                        }}
////                            else{
////                            }}
//                    case 1:
//                        System.out.printf("%s.%s, %20s.%s%n", "A", "Interprete literally", "B", "Look for meaning and possibility");
//                        response = input.next();
//
//                        if (response.toUpperCase().equals("A")) {
//                            noofa = noofa + 1;
//                        } else if (response.toUpperCase().equals("B")) {
//                            noofb = noofb + 1;
//                        }
//
//
//                    case 2:
//                        System.out.printf("%s.%s, %s, %s%20s.%s, %s, %s%n", "A", "Logical", "Thinking", "Questioning", "B", "Empathic", "Feeling", "Accomodating");
//                        response = input.next();
//
//                        if (response.toUpperCase().equals("A")) {
//                            noofa = noofa + 1;
//                        } else if (response.toUpperCase().equals("B")) {
//                            noofb = noofb + 1;
//                        }
//
//
//                    case 3:
//                        System.out.printf("%s.%s, %s, %s%20s.%s, %s, %s%n", "A", "Logical", "Thinking", "Questioning", "B", "Empathic", "Feeling", "Accomodating");
//                        response = input.next();
//
//                        if (response.toUpperCase().equals("A")) {
//                            noofa = noofa + 1;
//                        } else if (response.toUpperCase().equals("B")) {
//                            noofb = noofb + 1;
//                        }
//
//
//                    case 4:
//                        System.out.printf("%s.%s, %s, %s%20s.%s, %s, %s%n", "A", "Logical", "Thinking", "Questioning", "B", "Empathic", "Feeling", "Accomodating");
//                        response = input.next();
//
//                        if (response.toUpperCase().equals("A")) {
//                            noofa = noofa + 1;
//                        } else if (response.toUpperCase().equals("B")) {
//                            noofb = noofb + 1;
//                        }
//                }
//            }
//            System.out.println("No of A selected: " + noofa);
//            System.out.println("No of B selected: " + noofb);
//
////         }
////    }

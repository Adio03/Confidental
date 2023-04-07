package ClassExecise;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
               Press 1 Phone Book 
               Press 2 Messages""");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Press 1 Phone Book");
                System.out.println("Press 2 Messages");
                System.out.println("Press 3 Chat");
                System.out.println("Press 4 Call Register");
                System.out.println("Press 5 Tones");
                System.out.println("Press 6 Setting");
                System.out.println("Press 7 Call Divert");
                System.out.println("Press 8 Games");
                System.out.println("Press 9 Calculator");
                System.out.println("Press 10 Reminders");
                System.out.println("Press 11 Clocks");
                System.out.println("Press 12 Profile");
                System.out.println("Press 13 Sim Service ");
                break;
            case 2:
               int searchMenu = input.nextInt();
                switch (searchMenu){
                    case 1:
                        System.out.println("djfdjf");
                }


        }

        int searchMenu = input.nextInt();
        System.out.println("menu search...");
        switch (searchMenu) {
            case 1:
                int phoneBook = input.nextInt();
                System.out.println(" phonebook search ... ");
                switch (phoneBook) {
                    case 1:
                        System.out.println(" -> Search ");
                        System.out.println(" -> Service Nos");
                        System.out.println(" -> Add Name ");
                        System.out.println(" -> Erase ");
                        System.out.println(" -> Assign Tones ");
                        System.out.println(" -> Send b' Card ");
                        System.out.println(" -> Options ");
                        System.out.println(" -> Speed Dials ");
                        System.out.println(" -> voice Tags ");

                        int search = input.nextInt();
                        System.out.println("1.search");
                        switch (search) {
                            case 1:
                                System.out.println(search);
                                break;
                        }


                        int serviceNos = input.nextInt();
                        System.out.println("2.Service Nos");
                        switch (serviceNos) {
                            case 2:
                                System.out.println(serviceNos);
                                break;
                        }


                        int addName = input.nextInt();
                        System.out.println("3.Add name");
                        switch (addName) {
                            case 3:
                                System.out.println(addName);
                                break;
                        }


                        int erase = input.nextInt();
                        System.out.println("4.Erase");
                        switch (erase) {
                            case 4:
                                System.out.println(erase);
                                break;
                        }


                        int edit = input.nextInt();
                        System.out.println("5.Edit");
                        switch (edit) {
                            case 5:
                                System.out.println(edit);
                                break;
                        }


                        int assignTone = input.nextInt();
                        System.out.println("6.Assign tone");
                        switch (assignTone) {
                            case 6:
                                System.out.println(assignTone);
                                break;
                        }


                        int sendbCard = input.nextInt();
                        System.out.println("7.Send b card");
                        switch (sendbCard) {
                            case 7:
                                System.out.println(sendbCard);
                                break;
                        }


                        int options = input.nextInt();
                        System.out.println("8.Options");
                        switch (options) {
                            case 8:
                                System.out.println(options);
                                if (options == 8) {
                                    System.out.printf("%s%n%s%n", " 1.Type of view ", " 2.Memory ");
                                }
                                break;
                        }

                        int speedDials = input.nextInt();
                        System.out.println("9.Speed dials");
                        switch (speedDials) {
                            case 9:
                                System.out.println(speedDials);
                                break;
                        }


                        int voice = input.nextInt();
                        System.out.println("10.Voice");
                        switch (voice) {
                            case 10:
                                System.out.println(voice);
                        }
                        break;
                }


            case 2:
                int messages = input.nextInt();
                System.out.println(" Message Search ......");
                switch (messages) {
                    case 1:
                        System.out.println(" -> Write messages");
                        System.out.println(" -> Inbox");
                        System.out.println(" -> Outbox");
                        System.out.println(" -> Picture messages");
                        System.out.println(" -> Templates");
                        System.out.println(" -> Smileys");
                        System.out.println(" ->Message settings");
                        System.out.println(" -> Info service");
                        System.out.println(" -> Voice mailbox number");
                        System.out.println(" -> Service command editor");

                        int writeMessage = input.nextInt();
                        System.out.println("Write Message");
                        switch (writeMessage) {
                            case 1:
                                System.out.println(writeMessage);
                                break;
                        }

                        int inbox = input.nextInt();
                        System.out.println("Inbox");
                        switch (inbox) {
                            case 2:
                                System.out.println(inbox);
                                break;
                        }

                        int outBox = input.nextInt();
                        System.out.println("Outbox");
                        switch (outBox) {
                            case 3:
                                System.out.println(outBox);
                                break;
                        }

                        int pictureMessage = input.nextInt();
                        System.out.println("Picture Message");
                        switch (pictureMessage) {
                            case 4:
                                System.out.println(pictureMessage);
                                break;
                        }

                        int template = input.nextInt();
                        System.out.println("Template");
                        switch (template) {
                            case 5:
                                System.out.println(template);
                                break;
                        }

                        int smileys = input.nextInt();
                        System.out.println("Smiley");
                        switch (smileys) {
                            case 6:
                                System.out.println(smileys);
                                break;
                        }

                        int messageSettings = input.nextInt();
                        System.out.println("Message setting");
                        switch (messageSettings) {
                            case 7:

                                if (messageSettings == 7) {
                                    System.out.printf("%s%n%s%n", " 1.Set 1  ", " 2.Common ");

                                    int set1 = input.nextInt();
                                    System.out.println("Set 1");
                                    if (set1 == 1) {
                                        System.out.printf("%s%n%s%n%s%n", " 1.Message center number ", " 2.Messages sent as ", " 3.Message validity ");
                                    }
                                    int common = input.nextInt();
                                    System.out.println("Common");
                                    if (common == 2) {
                                        System.out.printf("%s%n%s%n%s%n", " 1.Delivery ", " 2.Reply via same center ", " 3.Character support ");
                                    }
                                }
                                System.out.println(messageSettings);
                                break;
                        }
                    case 3:
                        int chat = input.nextInt();
                        System.out.println("search Chat....");
                        switch (chat) {
                            case 1:
                                System.out.println(chat);
                                break;

                        }

                    case 4:
                        int callRegister = input.nextInt();
                        System.out.println("search Call Register....");
                        switch (callRegister) {
                            case 1:
                                System.out.println("1.Missed call");
                                System.out.println("2.Received call");
                                System.out.println("3.Dialled call");
                                System.out.println("4.Erase recent call list");
                                System.out.println("5.Show call duration");
                                System.out.println("6.show all call cost ");
                                System.out.println("7.Call cost setting ");
                                System.out.println("8.Prepaid credit");

                                int missCall = input.nextInt();
                                System.out.println("Miss Call");
                                switch (missCall) {
                                    case 1:
                                        System.out.println(missCall);
                                        break;
                                }

                                int receivedCall = input.nextInt();
                                System.out.println("Received Call");
                                switch (receivedCall) {
                                    case 2:
                                        System.out.println(receivedCall);
                                        break;

                                }

                                int dialledCall = input.nextInt();
                                System.out.println("Dialled Call");
                                switch (dialledCall) {
                                    case 3:
                                        System.out.println(dialledCall);
                                        break;
                                }

                                int eraseRecentCallList = input.nextInt();
                                System.out.println("Erase recent call lists");
                                switch (eraseRecentCallList) {
                                    case 4:
                                        System.out.println(eraseRecentCallList);
                                        break;
                                }

                                int showCallCallDuration = input.nextInt();
                                System.out.println("Show call duration");
                                switch (showCallCallDuration) {
                                    case 5:
                                        int ShowCallDuration = input.nextInt();
                                        if (ShowCallDuration == 5) {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.last call duration", "2.All call duration",
                                                    "3.Receive calls", "4.Dial call", "5.Clear timer");
                                        }
                                        System.out.println(ShowCallDuration);
                                        break;
                                }

                                int showCallCost = input.nextInt();
                                System.out.println("Show call cost");
                                switch (showCallCost) {
                                    case 6:
                                        if (showCallCost == 6) {
                                            System.out.printf("%s%n%s%n%s%n", "1.Last call cost", "2.All call cost", "3.Clear counter");
                                        }
                                        System.out.println(showCallCost);
                                        break;

                                }

                                int callCostSettings = input.nextInt();
                                System.out.println("Call Cost Setting");
                                switch (callCostSettings) {
                                    case 7:
                                        if (callCostSettings == 7) {
                                            System.out.printf("%s%n%s%n", "1.Call cost limit", "2.Show cost in");
                                        }
                                        System.out.println(callCostSettings);
                                        break;
                                }

                                int prepaidCredit = input.nextInt();
                                System.out.println("Prepaid Credit");
                                switch (prepaidCredit) {
                                    case 8:
                                        System.out.println(prepaidCredit);
                                        break;
                                }
                        }

                }
        }

    }
}


//                    case 5:
//                            int tones = input.nextInt();
//                            System.out.println("search Tones....");
//                            switch (tones){
//                                case 1:
//                                System.out.println("1.Ringing Tone");
//                                System.out.println("2.Ringing volume");
//                                System.out.println("3.Incoming call Alert");
//                                System.out.println("4.Composer");
//                                System.out.println("5.Message Alert Tone");
//                                System.out.println("6.Keypad Tone");
//                                System.out.println("7.Warming and Game Tone");
//                                System.out.println("8.Vibrating Alert");
//                                System.out.println("9.Character Saver");
//                            }
//                     case 6:
//                            int setting = input.nextInt();
//                            System.out.println("search Setting....");
//                            switch (setting) {
//                                case 1:
//                                    int callSetting = input.nextInt();
//                                    switch (callSetting) {
//                                        case 1:
//                                            System.out.println("1.Automatic Radia");
//                                            System.out.println("2.Speed Dialing");
//                                            System.out.println("3.Call Waiting Option");
//                                            System.out.println("4.Own Number Sending");
//                                            System.out.println("5.Phone line in use");
//                                            System.out.println("6.Automatic answer");
//
//
//                                    }
//                                    int phoneSetting =input.nextInt();
//                                    switch (phoneSetting) {
//                                        case 2:
//                                            System.out.println("1.Language");
//                                            System.out.println("2.Cell info display");
//                                            System.out.println("3.Welcome note");
//                                            System.out.println("4.Network Selection");
//                                            System.out.println("5.Light");
//                                            System.out.println("6.Confirm sim service action");
//
//
//                                    }
//                                    int securitySetting = input.nextInt();
//                                    switch (securitySetting) {
//                                        case 3:
//                                            System.out.println("1.PIN code request");
//                                            System.out.println("2.Call turning service");
//                                            System.out.println("3.Fixed dialing service");
//                                            System.out.println("4.closed user group");
//                                            System.out.println("5.Phone security");
//                                            System.out.println("6.Change access code");
//                                    }
//                                    System.out.println("4.Restore factory setting");
//                            }
//
//                    case 7 :
//                            int callDivert = input.nextInt();
//                            System.out.println("search Call Divert....");
//                            switch (callDivert) {
//                                case 1:
//                            }
//                    case 8:
//                            int games =input.nextInt();
//                            System.out.println("search Games ....");
//                            switch (games) {
//                                case 1:
//                            }
//                     case 9:
//                            int calculator = input.nextInt();
//                            System.out.println("search Calculator .....");
//                            switch (calculator) {
//                                case 1:
//                            }
//
//                     case 10:
//                            int reminder = input.nextInt();
//                            System.out.println("search Reminder.....");
//                            switch (reminder) {
//                                case 10:
//                            }
//                     case 11:
//                            int clock = input.nextInt();
//                            System.out.println("search Clock .....");
//                            switch (clock) {
//                                case 1:
//                                    System.out.println("1.Alarm clock");
//                                    System.out.println("2.clock setting");
//                                    System.out.println("3.Date setting");
//                                    System.out.println("4.Stop watch");
//                                    System.out.println("5.Countdown timer");
//                                    System.out.println("6.Auto update of date and time");
//
//
//                            }
//                     case 12:
//                            int profile = input.nextInt();
//                            System.out.println("Search Profile ......");
//                            switch (profile) {
//                                case 1:
//                            }
//
//                    case 13:
//                            int simService = input.nextInt();
//                            System.out.println("search Sim Service.....");
//                            switch (simService) {
//                                case 1:
//                            }
//                        }
//
//
//
//                }
//        }
//

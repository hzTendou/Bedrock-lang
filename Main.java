import java.io.*;
import java.util.Scanner;
public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final Scanner command = new Scanner(System.in);
    public static String cmd;
    public static String cd = "C:/";
    public static boolean cdstatus = false;
    public static File codef;
    public static boolean cmdstatus;
    public static boolean ifstatus;
    public static boolean skipcode;
    public static String line;
    public static String liner;
    public static int val1;
    public static int val2;
    public static File st = new File("C:/Users/User/Bedrock/variables/strings.txt");
    public static File it = new File("C:/Users/User/Bedrock/variables/int.txt");
    public static void print(String text) {
        System.out.print(text);
    }
    public static void printl(String text) {
        System.out.println(text);
    }
    public static void printf(String text) throws IOException {

        FileWriter stw = new FileWriter("C:/Users/User/Bedrock/variables/strings.txt", true);
        BufferedWriter bstw = new BufferedWriter(stw);
        stw.write(text);
        stw.close();
    }
    public static void printfi(String text) throws IOException {
        FileWriter itw = new FileWriter("C:/Users/User/Bedrock/variables/int.txt", true);
        BufferedWriter bitw = new BufferedWriter(itw);
        itw.write(text);
        itw.close();
    }
    public static void classreset() throws IOException {
        FileWriter stw = new FileWriter("C:/Users/User/Bedrock/variables/strings.txt");
        BufferedWriter bstw = new BufferedWriter(stw);
        stw.write("s$developer=Tendou\n");
        stw.close();
        FileWriter itw = new FileWriter("C:/Users/User/Bedrock/variables/int.txt");
        BufferedWriter bitw = new BufferedWriter(itw);
        itw.write("i$developer=31\n");
        itw.close();
    }
    public static void printfii(int text) throws IOException {

        FileWriter itw = new FileWriter("C:/Users/User/Bedrock/variables/int.txt", true);
        BufferedWriter bitw = new BufferedWriter(itw);
        itw.write(text);
        itw.close();
    }
    public static String getString(String name) throws IOException {
        FileReader sr = new FileReader(new File("variables/strings.txt"));
        BufferedReader sb = new BufferedReader(sr);
        String liner;
        while((liner = sb.readLine()) != null) {
            if (liner.startsWith(name)) {
                liner = liner.replace(name + "=", "");
                break;
            }
        }
        return liner;
    }
    public static int getInt(String name) throws IOException {
        FileReader sr = new FileReader(new File("variables/strings.txt"));
        BufferedReader sb = new BufferedReader(sr);
        String liner;
        while((liner = sb.readLine()) != null) {
            if (liner.startsWith(name)) {
                liner = liner.replace(name + "=", "");
                break;
            }
        }
        return Integer.parseInt(liner);
    }
    public static void main(String[] args) throws IOException {
        cmdstatus = true;
        skipcode = false;
        cdstatus = false;
        whilestatus = false;
        while (cmdstatus == true) {
            if (cdstatus = false) {
                System.out.print(RESET + ">> ");
            } else if (cdstatus = true) {
                System.out.print(RESET + "[" + cd + "]" + ">> ");
            }
            cmd = command.nextLine();
            if (cmd.startsWith("run ")) {
                cmd = cmd.replace("run ", "");
                Scanner input = new Scanner(System.in);
                Scanner inputi = new Scanner(System.in);
                if (cdstatus = false) {
                    codef = new File(cmd);
                } else if (cdstatus = true) {
                    codef = new File(cd + "/" + cmd);
                }
                if (!codef.exists()) {
                    System.out.println(RED + "You entered the wrong file path!");
                } else if (!cmd.endsWith(".bedrock")) {
                    System.out.println(RED + "This file is not bedrock file!");
                } else {
                    FileReader fr = new FileReader(codef);
                    BufferedReader br = new BufferedReader(fr);


                    while ((line = br.readLine()) != null) {
                        String liners = line.trim();
                        liner = liners;
                        String[] special = {"'", ")", "(", "{"};
                        for (String specialChar : special) {
                            liner = liner.replace(specialChar, "");

                        }
                        liner = liner.replaceAll(" ", "%");
                        if (skipcode == true) {
                            if (liner.startsWith("}")) {
                                skipcode = false;
                            }
                    }
                        else {
                            if (liner.startsWith("class") == true) {
                                classreset();
                            }
                            FileReader rst = new FileReader(st);
                            BufferedReader brst = new BufferedReader(rst);
                            FileReader rst1 = new FileReader(st);
                            BufferedReader brst1 = new BufferedReader(rst1);
                            FileReader rit = new FileReader(it);
                            BufferedReader brit = new BufferedReader(rit);
                            FileReader rit2 = new FileReader(it);
                            BufferedReader brit2 = new BufferedReader(rit2);
                            FileReader rst3 = new FileReader(st);
                            BufferedReader brst3 = new BufferedReader(rst3);
                            FileReader rst2 = new FileReader(st);
                            BufferedReader brst4 = new BufferedReader(rst2);
                            FileReader rit3 = new FileReader(it);
                            BufferedReader brit3 = new BufferedReader(rit3);
                            FileReader rit4 = new FileReader(it);
                            BufferedReader brit4 = new BufferedReader(rit4);

                            if (liner.startsWith("color") == true) {
                                if (liner.endsWith("RED") == true) {
                                    print(RED);
                                }
                                if (liner.endsWith("false") == true) {
                                    print(RESET);
                                }
                                if (liner.endsWith("YELLOW") == true) {
                                    print(YELLOW);
                                }
                                if (liner.endsWith("BLUE") == true) {
                                    print(BLUE);
                                }
                                if (liner.endsWith("BLACK") == true) {
                                    print(BLACK);
                                }
                                if (liner.endsWith("WHITE") == true) {
                                    print(WHITE);
                                }
                                if (liner.endsWith("CYAN") == true) {
                                    print(CYAN);
                                }
                                if (liner.endsWith("GREEN") == true) {
                                    print(GREEN);
                                }
                                if (liner.endsWith("PURPLE") == true) {
                                    print(PURPLE);
                                }
                            }

                            if (liner.startsWith("if")) {
                                String l1;
                                String l2;
                                String l3;
                                String l4;
                                liner = liner.replace("if", "");
                                if (!liner.contains("&&") && !liner.contains("||")) {
                                    String[] li = liner.split("%");
                                    if (li[0].startsWith("s$")) {
                                        if (li[1].equals("==")) {
                                            String var1 = getString(li[0]);
                                            String var2 = getString(li[2]);
                                            if (var1.equals(var2)) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else if (!var1.equals(var2)) {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }
                                        //==
                                        if (li[1].equals("!=")) {
                                            String var1 = getString(li[0]);
                                            String var2 = getString(li[2]);
                                            if (!var1.equals(var2)) {
                                                ifstatus = false;
                                                skipcode = true;
                                            } else if (var1.equals(var2)) {
                                                ifstatus = true;
                                                skipcode = false;
                                            }
                                        }
                                        //end of the string if
                                    } else if (li[0].startsWith("i$")) {
                                        if (li[1].equals("==")) {
                                            int var1 = getInt(li[0]);
                                            int var2 = getInt(li[2]);
                                            if (var1 == var2) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else if (var1 != var2) {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }
                                        //==
                                        if (li[1].equals("!=")) {
                                            int var1 = getInt(li[0]);
                                            int var2 = getInt(li[2]);
                                            if (var1 != var2) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }
                                        if (li[1].equals(">")) {
                                            int var1 = getInt(li[0]);
                                            int var2 = getInt(li[2]);
                                            if (var1 > var2) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }
                                        if (li[1].equals("<")) {
                                            int var1 = getInt(li[0]);
                                            int var2 = getInt(li[2]);
                                            if (var1 < var2) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }

                                        if (li[1].equals(">=")) {
                                            int var1 = getInt(li[0]);
                                            int var2 = getInt(li[2]);
                                            if (var1 >= var2) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }
                                        if (li[1].equals("<=")) {
                                            int var1 = getInt(li[0]);
                                            int var2 = getInt(li[2]);
                                            if (var1 <= var2) {
                                                ifstatus = true;
                                                skipcode = false;
                                            } else {
                                                ifstatus = false;
                                                skipcode = true;
                                            }
                                        }
                                        //end of the string if
                                    }

                                } else {
                                    String[] li = liner.split("%");
                                    if (li[3].contains("&&")){
                                        if (li[0].startsWith("s$")) {
                                            if (li[1].contains("==")) {
                                                if (li[4].startsWith("s$")) {
                                                    String var1 = getString(li[0]);
                                                    String var2 = getString(li[2]);
                                                    String var3 = getString(li[4]);
                                                    String var4 = getString(li[6]);
                                                    if (li[5].contains("==")) {
                                                        if (var1.equals(var2) && var3.equals(var4)) {
                                                            ifstatus = true;
                                                            skipcode = false;
                                                        } else {
                                                            ifstatus = false;
                                                            skipcode = true;
                                                        }
                                                    } else if (li[5].contains("!=")) {
                                                        if (var1.equals(var2) && !var3.equals(var4)) {
                                                            ifstatus = true;
                                                            skipcode = false;
                                                        } else {
                                                            ifstatus = false;
                                                            skipcode = true;
                                                        }
                                                    }
                                                }
                                                else if (li[4].startsWith("i$")) {
                                                    int var1 = getInt(li[0]);
                                                    int var2 = getInt(li[2]);
                                                    int var3 = getInt(li[4]);
                                                    int var4 = getInt(li[6]);
                                                    if (li[1].contains("==")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1 == var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 == var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 == var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 == var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 == var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 == var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                            if (li[1].contains("!=")) {
                                                if (li[4].startsWith("s$")) {
                                                    String var1 = getString(li[0]);
                                                    String var2 = getString(li[2]);
                                                    String var3 = getString(li[4]);
                                                    String var4 = getString(li[6]);
                                                    if (li[5].contains("==")) {
                                                        if (var1.equals(var2) && var3.equals(var4)) {
                                                            ifstatus = true;
                                                            skipcode = false;
                                                        } else {
                                                            ifstatus = false;
                                                            skipcode = true;
                                                        }
                                                    } else if (li[5].contains("!=")) {
                                                        if (var1.equals(var2) && !var3.equals(var4)) {
                                                            ifstatus = true;
                                                            skipcode = false;
                                                        } else {
                                                            ifstatus = false;
                                                            skipcode = true;
                                                        }
                                                    }
                                                }
                                                else if (li[4].startsWith("i$")) {
                                                    String var1 = getString(li[0]);
                                                    String var2 = getString(li[2]);
                                                    int var3 = getInt(li[4]);
                                                    int var4 = getInt(li[6]);
                                                    if (li[1].contains("==")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1.equals(var2) && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("!=")) {
                                                            if (var1.equals(var2) && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">")) {
                                                            if (var1.equals(var2) && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1.equals(var2) && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1.equals(var2) && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1.equals(var2) && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }
                                                    if (li[1].contains("!=")) {
                                                            if (li[5].contains("==")) {
                                                                if (!var1.equals(var2) && var3 == var4) {
                                                                    ifstatus = true;
                                                                    skipcode = false;
                                                                } else {
                                                                    ifstatus = false;
                                                                    skipcode = true;
                                                                }
                                                            } else if (li[5].contains("!=")) {
                                                                if (!var1.equals(var2) && var3 != var4) {
                                                                    ifstatus = true;
                                                                    skipcode = false;
                                                                } else {
                                                                    ifstatus = false;
                                                                    skipcode = true;
                                                                }
                                                            } else if (li[5].contains(">")) {
                                                                if (!var1.equals(var2) && var3 > var4) {
                                                                    ifstatus = true;
                                                                    skipcode = false;
                                                                } else {
                                                                    ifstatus = false;
                                                                    skipcode = true;
                                                                }
                                                            }
                                                            else if (li[5].contains("<")) {
                                                                if (!var1.equals(var2) && var3 < var4) {
                                                                    ifstatus = true;
                                                                    skipcode = false;
                                                                } else {
                                                                    ifstatus = false;
                                                                    skipcode = true;
                                                                }
                                                            }
                                                            else if (li[5].contains(">=")) {
                                                                if (!var1.equals(var2) && var3 >= var4) {
                                                                    ifstatus = true;
                                                                    skipcode = false;
                                                                } else {
                                                                    ifstatus = false;
                                                                    skipcode = true;
                                                                }
                                                            }
                                                            else if (li[5].contains("<=")) {
                                                                if (!var1.equals(var2) && var3 <= var4) {
                                                                    ifstatus = true;
                                                                    skipcode = false;
                                                                } else {
                                                                    ifstatus = false;
                                                                    skipcode = true;
                                                                }
                                                            }
                                                        }

                                                }
                                            }
                                        }

                                        else if (li[0].startsWith("i$")) {
                                            if (li[1].contains("==")) {
                                                if (li[4].startsWith("s$")) {
                                                    int var1 = getInt(li[0]);
                                                    int var2 = getInt(li[2]);
                                                    String var3 = getString(li[4]);
                                                    String var4 = getString(li[6]);
                                                    if (li[5].contains("==")) {
                                                        if (var1 == var2 && var3.equals(var4)) {
                                                            ifstatus = true;
                                                            skipcode = false;
                                                        } else {
                                                            ifstatus = false;
                                                            skipcode = true;
                                                        }
                                                    } else if (li[5].contains("!=")) {
                                                        if (var1 != var2 && !var3.equals(var4)) {
                                                            ifstatus = true;
                                                            skipcode = false;
                                                        } else {
                                                            ifstatus = false;
                                                            skipcode = true;
                                                        }
                                                    }
                                                }
                                                else if (li[4].startsWith("i$")) {
                                                    int var1 = getInt(li[0]);
                                                    int var2 = getInt(li[2]);
                                                    int var3 = getInt(li[4]);
                                                    int var4 = getInt(li[6]);
                                                    if (li[1].contains("==")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1 == var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 == var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 == var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 == var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 == var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 == var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }
                                                    if (li[1].contains("!=")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1 != var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 != var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 != var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 != var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 != var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 != var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }
                                                    if (li[1].contains(">")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1  var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 == var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 == var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 == var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 == var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 == var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }
                                                    if (li[1].contains("==")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1 == var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 == var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 == var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 == var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 == var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 == var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }
                                                    if (li[1].contains("==")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1 == var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 == var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 == var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 == var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 == var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 == var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }
                                                    if (li[1].contains("==")) {
                                                        if (li[5].contains("==")) {
                                                            if (var1 == var2 && var3 == var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains("!=")) {
                                                            if (var1 == var2 && var3 != var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        } else if (li[5].contains(">")) {
                                                            if (var1 == var2 && var3 > var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<")) {
                                                            if (var1 == var2 && var3 < var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains(">=")) {
                                                            if (var1 == var2 && var3 >= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                        else if (li[5].contains("<=")) {
                                                            if (var1 == var2 && var3 <= var4) {
                                                                ifstatus = true;
                                                                skipcode = false;
                                                            } else {
                                                                ifstatus = false;
                                                                skipcode = true;
                                                            }
                                                        }
                                                    }


                                                }
                                            }
                                        }
                                    }
                                    if (li[3].contains("||")){
                                        if (li[0].startsWith("s$")) {
                                            if (li[1].contains("==")) {
                                                while ((l1 = brst.readLine()) != null) {
                                                    if (l1.startsWith(li[0])) {
                                                        String[] l1s = l1.split("=");
                                                        String var1 = l1s[1];
                                                        while ((l2 = brst1.readLine()) != null) {
                                                            if (l2.startsWith(li[2])) {
                                                                String[] l2s = l2.split("=");
                                                                String var2 = l2s[1];
                                                                while ((l3 = brst3.readLine()) != null) {
                                                                    if (l3.startsWith(li[4])) {
                                                                        String[] l3s = l3.split("=");
                                                                        String var3 = l3s[1];
                                                                        while ((l4 = brst4.readLine()) != null) {
                                                                            if (l4.startsWith(li[6])) {
                                                                                String[] l4s = l4.split("=");
                                                                                String var4 = l4s[1];
                                                                                if (li[5].contains("==")) {
                                                                                    if (var1.equals(var2) || var3.equals(var4)) {
                                                                                        ifstatus = true;
                                                                                        skipcode = false;
                                                                                    }
                                                                                    else if (var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                   else if (!var1.equals(var2) || var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                    else if (!var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                }
                                                                                if (li[5].contains("!=")) {
                                                                                    if (var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                    else if (!var1.equals(var2) || var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                    else if (!var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (li[1].contains("!=")) {
                                                while ((l1 = brst.readLine()) != null) {
                                                    if (l1.startsWith(li[0])) {
                                                        String[] l1s = l1.split("=");
                                                        String var1 = l1s[1];
                                                        while ((l2 = brst1.readLine()) != null) {
                                                            if (l2.startsWith(li[2])) {
                                                                String[] l2s = l2.split("=");
                                                                String var2 = l2s[1];
                                                                while ((l3 = brst3.readLine()) != null) {
                                                                    if (l3.startsWith(li[4])) {
                                                                        String[] l3s = l3.split("=");
                                                                        String var3 = l3s[1];
                                                                        while ((l4 = brst4.readLine()) != null) {
                                                                            if (l4.startsWith(li[6])) {
                                                                                String[] l4s = l4.split("=");
                                                                                String var4 = l4s[1];
                                                                                if (li[5].contains("==")) {
                                                                                    if (!var1.equals(var2) || var3.equals(var4)) {
                                                                                        ifstatus = true;
                                                                                        skipcode = false;
                                                                                    }
                                                                                    else if (var1.equals(var2) || var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                   else if (!var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                }
                                                                                if (li[5].contains("!=")) {
                                                                                    if (!var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                    if (var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = true;
                                                                                        skipcode = false;
                                                                                    }
                                                                                    if (!var1.equals(var2) || var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                    if (!var1.equals(var2) || !var3.equals(var4)) {
                                                                                        ifstatus = false;
                                                                                        skipcode = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (li[0].startsWith("i$")) {

                                        }

                                    }
                                }

                            }
                            if (liner.startsWith("else")) {
                                if (ifstatus == true) {
                                    skipcode = true;
                                }
                                if (ifstatus == false) {
                                    skipcode = false;
                                }
                            }

                            if (liner.startsWith("string") == true) {

                                if (liner.startsWith("string%data")) {
                                    String[] rliner = liner.split("%");
                                    printf("s$" + rliner[2] + "\n");
                                }
                                if (liner.startsWith("string%input")) {
                                    liner = liner.replace("string%input", "");
                                    String[] input_text = liner.split("=");
                                    String splitinput = input_text[1];
                                    String inputText = splitinput.replaceAll("%", " ");
                                    System.out.print(inputText);
                                    String inputstr = input.nextLine();
                                    String input_name = input_text[0];
                                    input_name = input_name.replace("%", "");
                                    printf("s$" + input_name + "=" + inputstr + "\n");
                                }

                            }
                            if (liner.startsWith("int") == true) {

                                if (liner.startsWith("int%data")) {
                                    liner = liner.replace("int%data%", "");
                                    String[] int_splt = liner.split("=");
                                    String intspl = int_splt[1];
                                    if (intspl.contains("+") == false && intspl.contains("-") == false && intspl.contains("*") == false && intspl.contains("/") == false) {

                                        String[] rliner = liner.split("=");
                                        printfi("i$" + liner + "\n");
                                    } else {
                                        String line_string;
                                        String line_string2;
                                        if (int_splt[1].startsWith("m$i$")) {
                                            String ms = int_splt[1];
                                            ms = ms.replace("m$", "");
                                            if (ms.contains("+")) {
                                                ms = ms.replace("%+%", "%");
                                                String[] mssplit = ms.split("%");
                                                if (mssplit[1].contains("i$") == false) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);
                                                            int var2 = Integer.valueOf(mssplit[1]);
                                                            printfi("i$" + int_splt[0] + "=" + (var1 + var2) + "\n");
                                                        }
                                                    }
                                                }
                                                if (mssplit[1].contains("i$") == true) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);

                                                            while ((line_string2 = brit2.readLine()) != null) {
                                                                if (line_string2.startsWith(mssplit[1])) {
                                                                    String[] lss2 = line_string2.split("=");
                                                                    int var2 = Integer.valueOf(lss2[1]);
                                                                    printfi("i$" + int_splt[0] + "=" + (var1 + var2) + "\n");
                                                                }
                                                            }
                                                            // end
                                                        }
                                                    }
                                                }


                                            }
                                            if (ms.contains("-")) {
                                                ms = ms.replace("%-%", "%");
                                                String[] mssplit = ms.split("%");
                                                if (mssplit[1].contains("i$") == false) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);
                                                            int var2 = Integer.valueOf(mssplit[1]);
                                                            printfi("i$" + int_splt[0] + "=" + (var1 - var2) + "\n");
                                                        }
                                                    }
                                                }
                                                if (mssplit[1].contains("i$") == true) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);

                                                            while ((line_string2 = brit2.readLine()) != null) {
                                                                if (line_string2.startsWith(mssplit[1])) {
                                                                    String[] lss2 = line_string2.split("=");
                                                                    int var2 = Integer.valueOf(lss2[1]);
                                                                    printfi("i$" + int_splt[0] + "=" + (var1 - var2) + "\n");
                                                                }
                                                            }
                                                            // end
                                                        }
                                                    }
                                                }


                                            }

                                            if (ms.contains("*")) {
                                                ms = ms.replace("%*%", "%");
                                                String[] mssplit = ms.split("%");
                                                if (mssplit[1].contains("i$") == false) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);
                                                            int var2 = Integer.valueOf(mssplit[1]);
                                                            printfi("i$" + int_splt[0] + "=" + (var1 * var2) + "\n");
                                                        }
                                                    }
                                                }
                                                if (mssplit[1].contains("i$") == true) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);

                                                            while ((line_string2 = brit2.readLine()) != null) {
                                                                if (line_string2.startsWith(mssplit[1])) {
                                                                    String[] lss2 = line_string2.split("=");
                                                                    int var2 = Integer.valueOf(lss2[1]);
                                                                    printfi("i$" + int_splt[0] + "=" + (var1 * var2) + "\n");
                                                                }
                                                            }
                                                            // end
                                                        }
                                                    }
                                                }


                                            }

                                            if (ms.contains("/")) {
                                                ms = ms.replace("%/%", "%");
                                                String[] mssplit = ms.split("%");
                                                if (mssplit[1].contains("i$") == false) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);
                                                            int var2 = Integer.valueOf(mssplit[1]);
                                                            printfi("i$" + int_splt[0] + "=" + (var1 / var2) + "\n");
                                                        }
                                                    }
                                                }
                                                if (mssplit[1].contains("i$") == true) {
                                                    while ((line_string = brit.readLine()) != null) {
                                                        if (line_string.startsWith(mssplit[0])) {
                                                            String[] lss = line_string.split("=");
                                                            int var1 = Integer.valueOf(lss[1]);

                                                            while ((line_string2 = brit.readLine()) != null) {
                                                                if (line_string2.startsWith(mssplit[1])) {
                                                                    String[] lss2 = line_string2.split("=");
                                                                    int var2 = Integer.valueOf(lss2[1]);
                                                                    printfi("i$" + int_splt[0] + "=" + (var1 / var2) + "\n");
                                                                }
                                                            }
                                                            // end
                                                        }
                                                    }
                                                }


                                            }
                                            //end2
                                        } else {
                                            intspl = intspl.replaceAll("%", " ");
                                            if (intspl.contains("+") == true) {
                                                intspl = intspl.replace("m$", "");
                                                intspl = intspl.replace(" + ", "%");

                                                String[] intsplit = intspl.split("%");
                                                int value1 = Integer.valueOf(intsplit[0]);
                                                int value2 = Integer.valueOf(intsplit[1]);
                                                int total = value1 + value2;
                                                String finish = "i$" + int_splt[0] + "=" + String.valueOf(total) + "\n";
                                                printfi(finish);
                                            }
                                            if (intspl.contains("-") == true) {

                                                intspl = intspl.replace("m$", "");
                                                intspl = intspl.replace(" - ", "%");
                                                String[] intsplit = intspl.split("%");
                                                int value1 = Integer.valueOf(intsplit[0]);
                                                int value2 = Integer.valueOf(intsplit[1]);
                                                System.out.print(value1 - value2);
                                            }
                                            if (intspl.contains("*") == true) {

                                                intspl = intspl.replace("m$", "");
                                                intspl = intspl.replace(" * ", "%");
                                                String[] intsplit = intspl.split("%");
                                                int value1 = Integer.valueOf(intsplit[0]);
                                                int value2 = Integer.valueOf(intsplit[1]);
                                                System.out.print(value1 * value2);
                                            }
                                            if (intspl.contains("/") == true) {

                                                intspl = intspl.replace("m$", "");
                                                intspl = intspl.replace(" / ", "%");
                                                String[] intsplit = intspl.split("%");
                                                int value1 = Integer.valueOf(intsplit[0]);
                                                int value2 = Integer.valueOf(intsplit[1]);
                                                System.out.print(value1 / value2);
                                            }

                                        }


                                        // end 3
                                    }
                                }
                                if (liner.startsWith("int%input")) {
                                    liner = liner.replace("int%input", "");
                                    String[] input_text = liner.split("=");
                                    String splitinput = input_text[1];
                                    String inputText = splitinput.replaceAll("%", " ");
                                    System.out.print(inputText);
                                    int inputstr = inputi.nextInt();
                                    String input_name = input_text[0];
                                    input_name = input_name.replace("%", "");
                                    printfi("i$" + input_name + "=" + inputstr + "\n");
                                }

                            }

                            if (liner.startsWith("print") == true) {
                                String liner1345 = liner.replace("print", "");
                                liner1345 = liner1345.replaceAll("%", " ");
                                String[] liner_print = liner1345.split(":");

                                if (liner_print.length > 1) {

                                    for (int i = 0; i < liner_print.length; i++) {

                                        if (liner_print[i].startsWith("s$")) {
                                            String line_string;

                                            while ((line_string = brst.readLine()) != null) {

                                                if (line_string.startsWith(liner_print[i]) == true) {

                                                    String[] variablepr = line_string.split("=");
                                                    System.out.print(variablepr[1]);
                                                }
                                            }
                                        } else if (liner_print[i].startsWith("i$")) {
                                            String line_string;

                                            while ((line_string = brit.readLine()) != null) {

                                                if (line_string.startsWith(liner_print[i]) == true) {

                                                    String[] variablepr = line_string.split("=");
                                                    System.out.print(variablepr[1]);
                                                }
                                            }
                                        } else if (liner_print[i].startsWith("m$")) {
                                            String line_string;
                                            String line_string2;
                                            if (liner_print[i].startsWith("m$i$")) {
                                                String ms = liner_print[i];
                                                ms = ms.replace("m$", "");
                                                if (ms.contains("+")) {
                                                    ms = ms.replace(" + ", "%");
                                                    String[] mssplit = ms.split("%");
                                                    if (mssplit[1].contains("i$") == false) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);
                                                                int var2 = Integer.valueOf(mssplit[1]);
                                                                System.out.print(var1 + var2);
                                                            }
                                                        }
                                                    }
                                                    if (mssplit[1].contains("i$") == true) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);

                                                                while ((line_string2 = brit.readLine()) != null) {
                                                                    if (line_string2.startsWith(mssplit[1])) {
                                                                        String[] lss2 = line_string2.split("=");
                                                                        int var2 = Integer.valueOf(lss2[1]);
                                                                        System.out.print(var1 + var2);
                                                                    }
                                                                }
                                                                // end
                                                            }
                                                        }
                                                    }


                                                }
                                                if (ms.contains("-")) {
                                                    ms = ms.replace(" - ", "%");
                                                    String[] mssplit = ms.split("%");
                                                    if (mssplit[1].contains("i$") == false) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);
                                                                int var2 = Integer.valueOf(mssplit[1]);
                                                                System.out.print(var1 - var2);
                                                            }
                                                        }
                                                    }
if (mssplit[1].contains("i$") == true) {
    while ((line_string = brit.readLine()) != null) {
        if (line_string.startsWith(mssplit[0])) {
            String[] lss = line_string.split("=");
            int var1 = Integer.valueOf(lss[1]);

            while ((line_string2 = brit.readLine()) != null) {
                if (line_string2.startsWith(mssplit[1])) {
                    String[] lss2 = line_string2.split("=");
                    int var2 = Integer.valueOf(lss2[1]);
                    System.out.print(var1 - var2);
                }
            }
            // end
        }
    }
}


                                                }

                                                if (ms.contains("*")) {
                                                    ms = ms.replace(" * ", "%");
                                                    String[] mssplit = ms.split("%");
                                                    if (mssplit[1].contains("i$") == false) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);
                                                                int var2 = Integer.valueOf(mssplit[1]);
                                                                System.out.print(var1 * var2);
                                                            }
                                                        }
                                                    }
                                                    if (mssplit[1].contains("i$") == true) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);

                                                                while ((line_string2 = brit.readLine()) != null) {
                                                                    if (line_string2.startsWith(mssplit[1])) {
                                                                        String[] lss2 = line_string2.split("=");
                                                                        int var2 = Integer.valueOf(lss2[1]);
                                                                        System.out.print(var1 * var2);
                                                                    }
                                                                }
                                                                // end
                                                            }
                                                        }
                                                    }


                                                }

                                                if (ms.contains("/")) {
                                                    ms = ms.replace(" / ", "%");
                                                    String[] mssplit = ms.split("%");
                                                    if (mssplit[1].contains("i$") == false) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);
                                                                int var2 = Integer.valueOf(mssplit[1]);
                                                                System.out.print(var1 / var2);
                                                            }
                                                        }
                                                    }
                                                    if (mssplit[1].contains("i$") == true) {
                                                        while ((line_string = brit.readLine()) != null) {
                                                            if (line_string.startsWith(mssplit[0])) {
                                                                String[] lss = line_string.split("=");
                                                                int var1 = Integer.valueOf(lss[1]);

                                                                while ((line_string2 = brit.readLine()) != null) {
                                                                    if (line_string2.startsWith(mssplit[1])) {
                                                                        String[] lss2 = line_string2.split("=");
                                                                        int var2 = Integer.valueOf(lss2[1]);
                                                                        System.out.print(var1 / var2);
                                                                    }
                                                                }
                                                                // end
                                                            }
                                                        }
                                                    }


                                                }
                                                //end2
                                            }
                                            //end 4
                                            else {
                                                if (liner_print[i].contains("+") == true) {
                                                    String intplus1 = liner_print[i];
                                                    intplus1 = intplus1.replace("m$", "");
                                                    intplus1 = intplus1.replace(" + ", "%");
                                                    String[] intsplit = intplus1.split("%");
                                                    if (intsplit[1].contains("$") == false) {
                                                        int value1 = Integer.valueOf(intsplit[0]);
                                                        int value2 = Integer.valueOf(intsplit[1]);
                                                        System.out.print(value1 + value2);
                                                    }
                                                }
                                            }
                                            if (liner_print[i].contains("-") == true) {
                                                String intplus1 = liner_print[i];
                                                intplus1 = intplus1.replace("m$", "");
                                                intplus1 = intplus1.replace(" - ", "%");
                                                String[] intsplit = intplus1.split("%");
                                                if (intsplit[1].contains("$") == false) {
                                                    int value1 = Integer.valueOf(intsplit[0]);
                                                    int value2 = Integer.valueOf(intsplit[1]);
                                                    System.out.print(value1 - value2);
                                                }
                                            }
                                            if (liner_print[i].contains("*") == true) {
                                                String intplus1 = liner_print[i];
                                                intplus1 = intplus1.replace("m$", "");
                                                intplus1 = intplus1.replace(" * ", "%");
                                                String[] intsplit = intplus1.split("%");
                                                if (intsplit[1].contains("$") == false) {
                                                    int value1 = Integer.valueOf(intsplit[0]);
                                                    int value2 = Integer.valueOf(intsplit[1]);
                                                    System.out.print(value1 * value2);
                                                }
                                            }
                                            if (liner_print[i].contains("/") == true) {
                                                String intplus1 = liner_print[i];
                                                intplus1 = intplus1.replace("m$", "");
                                                intplus1 = intplus1.replace(" / ", "%");
                                                String[] intsplit = intplus1.split("%");
                                                if (intsplit[1].contains("$") == false) {
                                                    int value1 = Integer.valueOf(intsplit[0]);
                                                    int value2 = Integer.valueOf(intsplit[1]);
                                                    System.out.print(value1 / value2);
                                                }
                                            }
                                        } else {
                                            System.out.print(liner_print[i]);
                                        }
                                    }
                                    System.out.print("\n");
                                } else {
                                    System.out.println(liner_print[0]);
                                }
                            }

                        }
                    }
                }
                cmdstatus = true;
            } else if (cmd.startsWith("cd")) {
                cmd = cmd.replace("cd ", "");
                cd = cmd;
                cdstatus = true;
            } else if (cmd.equals("stop")) {
                cmdstatus = false;
            } else {
                System.out.println(RED + cmd + " is not found!");
                cmdstatus = true;
            }
        }
        //end of the main
    }
}

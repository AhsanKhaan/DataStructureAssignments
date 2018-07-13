/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_driver;

/**
 *
 * @author M.Ahsan
 */
public class IntoPost {

    String input;
    char output = ' ';
    StackX thestack;
   

    public IntoPost(String in) {
        input = in;
        int Stacksize = input.length();
        thestack = new StackX(Stacksize);
      

    }

    public char translate() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            System.out.println("For stack" + thestack.toString());
            switch (ch) {

                case '(':
                    thestack.push(ch);
                    break;
                case ')':
                    thestack.pop();
                    while (ch != '(') {
                        output += thestack.pop();
                        break;
                    }
                    switch (ch) {
                        case '/':
                            thestack.push(ch);
                            break;
                        case '*':
                            if (thestack.peak() == '/') {
                                thestack.push(ch);
                                output += thestack.pop();
                                break;
                            }
                        case '+':
                            if ((thestack.peak() == '/') || (thestack.peak() == '*')) {
                                thestack.push(ch);
                               output += thestack.pop();
                                break;
                            }
                        case '-':

                            if ((thestack.peak() == '+') || (thestack.peak() == '/') || (thestack.peak() == '*')) {
                                thestack.push(ch);
                                output += thestack.pop();
                                break;
                            }
                    }

                default:
                    output += thestack.pop();
                    break;
            }

        }
        return output;
    }
};

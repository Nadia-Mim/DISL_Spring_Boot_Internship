package tagcontentextractor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
 */
public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while(testCases>0){
            String line = in.nextLine();
            Pattern p = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);
            
            while (m.find()) {
            System.out.println(m.group(2));
            }
            m.reset();
            
            if ( ! m.find()) {
                System.out.println("None");
            }

            testCases--;
        }
    }
    
}

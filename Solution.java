class Solution {
    public int romanToInt(String s) {
       int tot=0; 
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000,k=0;
        for (k=0;k<s.length()-1;k++){
             if (!((s.charAt(k) == 'I' && (s.charAt(k + 1) == 'X' || s.charAt(k + 1) == 'V')) || (s.charAt(k) == 'X' && (s.charAt(k + 1) == 'L' || s.charAt(k + 1) == 'C')) || (s.charAt(k) == 'C' && (s.charAt(k + 1) == 'D' || s.charAt(k + 1) == 'M'))))
               
            switch (s.charAt(k)){
                case 'I':
                    tot+=I;
                    break;
                case 'V':
                    tot+=V;
                    break;
                case 'X':
                    tot+=X;
                    break;
                case 'L':
                    tot+=L;
                    break;
                case 'C':
                    tot+=C;
                    break;
                case 'D':
                    tot+=D;
                    break;
                case 'M':
                    tot+=M;
                    break;            
            }
             else if ((s.charAt(k) == 'I' && s.charAt(k + 1) == 'X')){
                tot += (X - I);
                k++;
            }
            else if ((s.charAt(k) == 'I' && s.charAt(k + 1) == 'V')){
                tot += (V - I);
                k++;
            }
            else if ((s.charAt(k) == 'X' && s.charAt(k + 1) == 'L')){
                tot += (L - X);
                k++;
            }
            else if ((s.charAt(k) == 'X' && s.charAt(k + 1) == 'C')){
                tot += (C - X);
                k++;
            }
            else if ((s.charAt(k) == 'C' && s.charAt(k + 1) == 'D')){
                tot += (D - C);
                k++;
            }
            else if ((s.charAt(k) == 'C' && s.charAt(k + 1) == 'M')){
                tot += (M - C);
                k++;
            }       
    
    }  
        if (k!=s.length())
        switch (s.charAt(s.length()-1)){
                case 'I':
                    tot+=I;
                    break;
                case 'V':
                    tot+=V;
                    break;
                case 'X':
                    tot+=X;
                    break;
                case 'L':
                    tot+=L;
                    break;
                case 'C':
                    tot+=C;
                    break;
                case 'D':
                    tot+=D;
                    break;
                case 'M':
                    tot+=M;
                    break;            
            }                  
        return tot;
    }
}

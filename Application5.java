class Application5
{  static void main(String[ ] args)
     { // recherche séquentielle dans un tableau
        int [ ] table= {13,-5,7,8,-6,6,4,78,2,45};
        byte elt = 4;
        short i ;
        for ( i = 0 ; i<8 ; i++ )
        if (elt= =table[i]) break ;
        afficher(i,elt);
      }
   static void afficher (int rang , long val)
   { if (rang == 8)
        System.out.println("valeur : "+val+" pas trouvée.////////////////");
      else
        System.out.println("valeur : "+val+" trouvée au rang :"+ rang)//////////////////;
   }
}

package chercher;

public class Chercher {

	public int chercher1(int x, int []  tab){         
		/*renvoie l'indice minimal de l'occurrence de x dans tab
		 * -1 si non present. 
		 * Algorithme de recherche dichotomique 1
		 * */
		int i,j,m;
		int n = tab.length;
		i = 0; j= n - 1; m = 0;
		boolean trouve = false;
		//chercher si present
		while (i <= j) {
			m = (i + j) / 2;
			if (tab[m] < x){
				i = m + 1;
			}
			if (tab[m] > x) {
				j = m - 1;
			}
			if (tab[m] == x){
				trouve = true;
				break;
			}
			if (i > n-1 || j < 0) {
				trouve = false;
				break;
			}
		}
		//determiner l'indice minimal
		if (!trouve) {
			return -1;
		}
		if (tab[0] == x) {
			return 0;
		}
		i = 0;
		j = m;
		while (i < j) {
			m = (i + j)/2;
			if (m == i) {
				m = j;
				break;
			} else {
				if (tab[m] == x) {
					j = m;
				} else {
					i = m;
				}
			}	
		}
		return m;
	}

	public int chercher2(int x, int [] tab){ 
		/*recherche dichotomique 2*/
		int i,j,m;
		boolean found;
		i=1; 
		j= tab.length;
		m=0;
		found=false;
		//chercher si present
		while (!(i==j && !found)) {
			m=(i+j)/2;
			if (tab[m]<x){
				i=m+1;
			}    else {
				if(tab[x]==m) {
					found=true;
				}    else {
					j=m-1;
				}
			}
		}
		//determiner l'indice minimal
		if (found) {
			return m;
		} else {
			return -1;
		}
	}

	public int chercher3(int x, int [] tab){         
		/*recherche dichotomique 3*/
		int i,j,m;
		i = 1; 
		j = tab.length;
		m=0;
		//chercher si present
		while (i!=j) {
			m=(i+j)/2;
			if (tab[m]<=x) i=m;
			else j=m;
		}
		//determiner l'indice minimal
		if (x != tab[m]) {
			return - 1;
		} else {
			i = 0;
			while (tab[i] != x) {
				i ++;
			}
			return i;
		}
	}

	public int chercher4(int x, int [] tab){  
		/*recherche dichotomique 4*/
		int i,j,m;
		i=1; 
		j = tab.length;
		m=0;
		boolean trouve = false;
		//chercher si present
		while (i!=j) {
			m=(i+j)/2;
			if (tab[m]<=x) i=m;
			if (tab[m] == x) {
				trouve = true;
			}
			else j=m;
		}
		//determiner l'indice minimal
		if (!trouve) {
			return -1;
		}
		i = 0;
		while (tab[i] != x) {
			i ++;
		}
		return i;		
	}

	public int chercher5(int x, int [] tab){  
		/*recherche dichotomique 5*/
		int i, j, m;
		boolean trouve = false;	
		i = 0 ; 
		j = tab.length - 1; 
		m = 0;
		while ((i<=j)&&(!trouve) ){
			m=(i+j)/2;
			if (x==tab[m]){
				trouve=true;
			}	else { 
				if (x < tab[m]){
					j=m-1;		
				} else {
					i=m+1;
				}
			}
		}
		//determiner l'indice minimal
		if (!trouve) {
			return -1;
		}
		if (tab[0] == x) {
			return 0;
		}
		i = 0;
		j = m;
		while (i < j) {
			m = (i + j)/2;
			if (m == i) {
				m = j;
				break;
			} else {
				if (tab[m] == x) {
					j = m;
				} else {
					i = m;
				}
			}	
		}
		return m;
	}
}

#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
 
int main()
{
    char aux , i , f[8] ={'f' ,'s', 'j', 'b', 'z', 'p', 'v', 'x'} , F[8] = {'F' , 'S' , 'J' , 'B' , 'Z' , 'P' , 'V' , 'X'} ;
	char letra;
	int ant_f = 0;
	int eh_f = 0; 
	while(scanf("%c" , &letra) != EOF)
	{

		eh_f = 0;
		for(i = 0; i < 8 ; i++)
		{
			if(letra == f[i]) {
				letra = 'f';
				eh_f = 1;
			};
			if(letra == F[i]) {
				letra = 'F';
				eh_f = 1;
			};
		}
		if (eh_f == 0)  
			printf("%c" , letra);
		else 
		{
			if (ant_f == 0) 
				printf("%c" , letra);	
			
		}
		if (eh_f == 1) 
			ant_f = 1;
	    else 
			ant_f = 0;
		
	}
	
    return 0;
}

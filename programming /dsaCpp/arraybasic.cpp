#include<iostream>

using namespace std;

int main(){
    int a[5]={1,2,3,4,5};
    a[0]=12;
    a[1]=15;
    a[2]=25;

    cout<<sizeof(a)<<endl;
    cout<<a[1]<<endl;

    for (int x:a)//read as for x in a 
    {
        cout<<x<<endl;
    }

    return 0;
}


#include <stdio.h>

			
void main() {
	int disks = 3;
	solveHanoi(disks, 'A', 'B', 'C');
}

void solveHanoi(int disks, char srcRod, char tempRod, char destRod) {
	if (disks == 1) {
		printf("Move disk %d from %c to %c", disks, srcRod, destRod);
	} else {
		solveHanoi(disks - 1, srcRod, destRod, tempRod);
		printf("Move disk %d from %c to %c", disks, srcRod, destRod);
		solveHanoi(disks - 1, tempRod, srcRod, destRod);
	} 
}
A
(Source)
B
(Temporary)
C
(Destination)
Output

		
Function call execution Stack   
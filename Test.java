
import java.util.Arrays;

class Test {
static double[] append(double v , double[] arr1){
double[] arr2 = new double[arr1.length+1];
for (int i = 0;i<arr1.length;i++){
		arr2[i] = arr1[i];
	}
arr2[arr1.length] = v;

return arr2;

}


static double[] insert(int index,double v,double[] arr1)
{double[] arr2 = new double[arr1.length+1];
for(int i = 0; i<arr1.length;i++){
	if(i<index)
		arr2[i] = arr1[i];
	else
		arr2[i+1] = arr1[i];
	}

arr2[index] = v;
return arr2;
}


static double[] pop(int index,double[] arr1){
	double[] arr2 = new double[arr1.length-1];
	for (int i = 0;i<arr2.length;i++){
		if(i<index)
			arr2[i] = arr1[i];
		else
			arr2[i] = arr1[i+1];
	}
return arr2;
} 


static int index(int v, double[] arr1){
for (int i = 0; i<arr1.length;i++){

if(v == arr1[i])
	return i;
}

return -1;

}

static double[] remove (int v,double[] arr1){
double[] arr2 = new double[arr1.length-1];
int i = index(v,arr1);
if (i>=0)
	return pop(i,arr1);
else
	return arr1;

}

public static void main (String[] args){



double[] arr1 = pop(2,new double[]{1,2,3,4,5});
System.out.println(Arrays.toString(remove(2,new double[]{1,2,3,4,5})));
System.out.println ();


}

}
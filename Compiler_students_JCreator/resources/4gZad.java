program 
{
	main() -> void {
		int[] arr = int[10];
		arr[0] = 33;
		arr[1] = 11;
		arr[2] = 22;
		arr[3] = 44;
		arr[4] = 55;
		arr[5] = 66;
		arr[6] = 77;
		arr[7] = 88;
		arr[8] = 99;
		arr[9] = 111;
		
		int num;
		
		print("Print a number:");
		read(num);
		
		int i = 0;
		while (i < 10) {
			if (arr[i] == num) {
				print ("It's a match!");
				return 1;
			}
			
			i = i + 1;
		}
		
		print("No match!");
	}
}
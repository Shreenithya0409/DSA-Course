public class Linearsearch {

    public static int LS(int nums[],int k){
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10,12,14,16};
        int k=20;
        int ind=LS(n, k);
        if (ind==-1) {
            System.out.println("Key Not Found");
        } else {
            System.out.println("KEY Found at Position: "+ind);
        }
    }
}
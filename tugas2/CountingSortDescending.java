public class CountingSortDescending {
   // fungsi counting sort
   public static void countingSortDescending(int[] array) {
    // Temukan nilai maksismum
    int max = array[0];
    for (int num : array) {
        if (num > max) {
            max = num;
        }
    }

    // buat array count
    int[] count = new int[max + 1];

    // hitung frekuensi tiap elemen
    for (int num : array) {
        count[num]++;
    }

    // buat array hasil
    int index = 0;
    for (int i = count.length -1; i >= 0; i--) {
        while (count[i] > 0) {
           array[index] = i;
           index++;
           count[i]--;  
        }
    }
   }


    // fungsi main untuk eksekusi program
    public static void main(String[] args) {
        int[] data = {20, 21, 26, 22, 34, 50};

        System.out.println("Data sebelum diurutkan: ");
        for(int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        countingSortDescending(data);

        System.out.println("Data setelah diurutkan: ");
          for(int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
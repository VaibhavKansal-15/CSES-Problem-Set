import java.util.*;

public class JosephusProblemII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        FenwickTree ft = new FenwickTree(n);
        for (int i = 1; i <= n; i++) {
            ft.update(i, 1); // Mark all children as present
        }
        List<Integer> ans = new ArrayList<>();
        int index = 0; // Start at the first child

        for (int remaining = n; remaining > 0; remaining--) {
            index = (index + k) % remaining; // Calculate the index of the child to remove
            int child = ft.findKth(index + 1); // Find the (index + 1)-th remaining child
            ans.add(child); // Add the removed child to the answer
            ft.update(child, -1); // Mark the child as removed
        }

        // Print the removal order
        for (int child : ans) {
            System.out.print(child + " ");
        }
        System.out.println();
    }

    // Fenwick Tree implementation
    static class FenwickTree {
        int size;
        int[] tree;

        public FenwickTree(int n) {
            this.size = n + 1;
            this.tree = new int[size];
        }

        // Update the tree at a specific index
        public void update(int index, int value) {
            for (; index < size; index += index & -index) {
                tree[index] += value;
            }
        }

        // Query the prefix sum up to a specific index
        public int query(int index) {
            int sum = 0;
            for (; index > 0; index -= index & -index) {
                sum += tree[index];
            }
            return sum;
        }

        // Find the k-th remaining child
        public int findKth(int k) {
            int low = 1, high = size - 1;
            while (low < high) {
                int mid = (low + high) / 2;
                if (query(mid) >= k) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}
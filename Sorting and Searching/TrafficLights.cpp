#include <iostream>
#include <set>
#include <vector>

using namespace std;
int main() {
    long long x, n;
    cin >> x >> n;
    vector<long long> positions(n);
    for (long long i = 0; i < n; i++) {
        cin >> positions[i];
    }
    // Set to store traffic light positions
    set<long long> lights;
    lights.insert(0);
    lights.insert(x);
    // Multiset to store passage lengths
    multiset<long long> lengths;
    lengths.insert(x);
    for (long long i = 0; i < n; i++) {
        long long p = positions[i];
        // Find the nearest traffic lights
        auto it = lights.upper_bound(p);
        long long right = *it;
        long long left = *(--it);
        // Remove the old passage length
        lengths.erase(lengths.find(right - left));
        // Add the new passage lengths
        lengths.insert(p - left);
        lengths.insert(right - p);
        // Insert the new traffic light
        lights.insert(p);
        // Output the largest passage length
        cout << *(--lengths.end()) << " ";
    }
    cout << endl;
    return 0;
}

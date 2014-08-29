
// {{{ $VIMCODER$ <-----------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <limits>
#include <list>
#include <map>
#include <memory>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

using namespace std;

// }}}

#define ZERO(a) memset(a, 0, sizeof(a))
#define FOR(x,to) for(x=0;x<to;++x)
#define ITR(x,c) for(__typeof(c.begin()) x=c.begin();x!=c.end();++x)

class CandyMaking
{
public:
    double findSuitableDensity(vector <int> cv, vector <int> dw)
    {
        vector<double> containerVolume, desiredWeight;
        for(int i = 0; i < cv.size(); ++i) {
            containerVolume.push_back(cv[i]);
            desiredWeight.push_back(dw[i]);
        }

        // Mean density, weighted by volume
        double totalVol = 0;
        double d = 0;
        for(int i = 0; i < containerVolume.size(); ++i) {
            d += desiredWeight[i];
            totalVol += containerVolume[i];
        }
        d = d / totalVol;
        cout << "Picked density " << d << endl;

        double ans = 0;
        for(int i = 0; i < desiredWeight.size(); ++i) {
            ans += abs(d * containerVolume[i] - desiredWeight[i]);
        }

        return ans;
    }
};

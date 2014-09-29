
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
        double ans = 1e100;
        for(int i = 0; i < cv.size(); ++i) {
            double thisDensity = dw[i] / (double) cv[i];
            double thisAns = 0;
            for(int j = 0; j < cv.size(); ++j) {
                thisAns += abs(dw[j] - thisDensity * cv[j]);
            }
            ans = min(ans, thisAns);
        }
        return ans;
    }
};

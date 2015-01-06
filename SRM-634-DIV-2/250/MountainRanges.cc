
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

class MountainRanges
{
public:
    int countPeaks(vector <int> heights)
    {
        if(heights.size() == 1) return 1;

        int res = 0;
        heights.insert(heights.begin(), 1);
        heights.push_back(1);
        for(int i = 1; i < heights.size() - 1; ++i) {
            if(heights[i] > heights[i-1] && heights[i] > heights[i+1])
                ++res;
        }
        return res;
    }
};


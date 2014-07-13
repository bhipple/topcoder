
// {{{ $VIMCODER$ <-----------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <limits>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

using namespace std;

// }}}

class GridPointsOnCircle
{
public:
    int countPoints(int rSquare)
    {
        int x = 1, pts = 0;

        double r = sqrt(rSquare);
        while(x <= r + 1) {
            double y = sqrt(rSquare - x * x);
            if(y == (int) y) {
                ++pts;
            }
            ++x;
        }

        return 4 * pts;
    }
};


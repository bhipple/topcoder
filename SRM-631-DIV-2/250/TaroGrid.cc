
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

class TaroGrid
{
public:
    int getNumber(vector <string> grid)
    {
        int N = grid.size();
        int cons[N][N];
        int longest = 1;
        for(int i = 0; i < N; ++i) {
            cons[0][i] = 1;
        }
        for(int i = 1; i < N; ++i) {
            for(int j = 0; j < N; ++j) {
                if(grid[i-1][j] == grid[i][j]) {
                    cons[i][j] = 1 + cons[i-1][j];
                    longest = max(longest, cons[i][j]);
                }
                else {
                    cons[i][j] = 1;
                }
            }
        }
        return longest;
    }
};


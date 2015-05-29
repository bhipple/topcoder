
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

class GameOfStones
{
public:
    int count(vector <int> stones)
    {
        int parity = stones[0] % 2;
        for(size_t i = 1; i < stones.size(); ++i) {
            if(stones[i] % 2 != parity) {
                return -1;
            }
        }
        int totalStones = std::accumulate(stones.begin(), stones.end(), 0);
        int perPile = totalStones / stones.size();
        if(totalStones % stones.size() != 0 || perPile %2 != parity) return -1;

        int under = 0, over = 0;
        for(int i = 0; i < stones.size(); ++i) {
            if(stones[i] < perPile) {
                under += abs(stones[i] - perPile) / 2;
            }
            if(stones[i] > perPile) {
                over += abs(stones[i] - perPile) / 2;
            }
        }

        if(under != over) return -1;
        return under;
    }
};


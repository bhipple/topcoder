
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

class IsingModel
{
public:
    int energy(vector <string> spins)
    {
        int energy = 0;

        for(int i=0; i<spins.size(); ++i) {
            for(int j = 0; j < spins[0].size() - 1; ++j) {
                if(spins[i][j] != spins[i][j+1])
                    energy++;
                else
                    energy--;
            }
        }

        for(int i=0; i<spins.size() - 1; ++i) {
            for(int j = 0; j < spins[0].size(); ++j) {
                if(spins[i][j] != spins[i+1][j])
                    energy++;
                else
                    energy--;
            }
        }

        return energy;
    }
};


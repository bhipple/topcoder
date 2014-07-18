
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

class HappyLetterDiv2
{
public:
    char getHappyLetter(string letters)
    {
        sort(letters.begin(), letters.end());
        vector<pair<int, char> > freqchar;

        for(int i = 0; i < letters.size(); ++i) {
            char last = letters[i];
            int k = 1;
            ++i;
            while(last == letters[i]) {
                ++k;
                ++i;
            }
            freqchar.push_back(make_pair(k, last));
            --i;
        }
        sort(freqchar.begin(), freqchar.end());

        int most = freqchar[freqchar.size() - 1].first;
        int i = 0;
        while(i < freqchar.size() - 1) {
            if(most <= freqchar[i].first) {
                return '.';
            }
            most -= freqchar[i].first;
            ++i;
        }
        return freqchar[freqchar.size() - 1].second;
    }
};


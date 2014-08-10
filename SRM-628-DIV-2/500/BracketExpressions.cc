
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

class BracketExpressions
{
public:
    string ifPossible(string expression)
    {
        stack<char> brackets;
        return testPossible(expression, brackets, 0) ? "possible" : "impossible";
    }

    bool testPossible(string& expression, stack<char> brackets, int i) {
        for(; i < expression.size(); ++i) {
            if(expression[i] == 'X') {
                if(brackets.size()) {
                    char top = brackets.top();
                    brackets.pop();
                    if(testPossible(expression, brackets, i+1)) return true;
                    brackets.push(top);
                }
                brackets.push('W');
                return testPossible(expression, brackets, i+1);
            }

            if(expression[i] == '(' || expression[i] == '{' || expression[i] == '[') {
                brackets.push(expression[i]);
                continue;
            }

            if(!brackets.size()) return false;
            char top = brackets.top();
            brackets.pop();
            if(top == 'W') continue;

            if(expression[i] == ')') {
                if(top != '(') return false;
            }
            else if(expression[i] == '}') {
                if(top != '{') return false;
            }
            else if(expression[i] == ']') {
                if(top != '[') return false;
            }
        }

        if(brackets.size() == 0) return true;
        return false;
    }
};


#include <iostream>
#include <bitset>

int main()
{
    float input = 2.3;
    unsigned int output = *((unsigned int*)&input);
    std::bitset<32> bin(output);
    std::cout << bin << std::endl; return 0;
}
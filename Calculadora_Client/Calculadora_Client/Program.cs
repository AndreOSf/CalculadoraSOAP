using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculadora_Client
{
    class Program
    {
        static void Main(string[] args)
        {
            var calculadora = new Calculadora.Calculadora_ServerClient();
            var soma = calculadora.soma(5, 5);
            var multiplicacao = calculadora.multiplicacao(5, 5);
            var divisao = calculadora.divisao(5, 5);
            var subtracao = calculadora.subtracao(5, 5);
            Console.WriteLine(soma);
            Console.WriteLine(multiplicacao);
            Console.WriteLine(divisao);
            Console.WriteLine(subtracao);
        }
    }
}

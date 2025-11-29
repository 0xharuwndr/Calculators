using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    class Program
    {
        static void Main()
        {
            bool keepRunning = true;
            string[] nums = {"First", "Second", "Third"};
            string[] invalid = { "Invalid input. Please enter a valid number." };

            while (keepRunning)
            {
                Console.WriteLine("Calculator");
                Console.WriteLine("Select an operation(+,-,*,/)");
                Console.WriteLine("To quit/exit the program enter q");
                Console.Write("Enter operation: ");
                string choice = Console.ReadLine();

                if (choice == "q")
                {
                    keepRunning = false;
                    continue;
                }

                double num1, num2, num3 = 0;
                bool hasNum3 = false;

                switch (choice)
                {
                    case "+":
                        Console.Write("Enter the " + nums[0] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num1))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[0] + " number: ");
                        }

                        Console.Write("Enter the " + nums[1] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num2))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[1] + " number: ");
                        }

                        Console.Write("Enter the " + nums[2] + " number: (optional, press Enter to skip): ");
                        string input = Console.ReadLine();
                        if (!string.IsNullOrEmpty(input) && double.TryParse(input, out num3))
                        {
                            hasNum3 = true;
                        }

                        Console.WriteLine("-----------------------------");
                        Console.WriteLine("Answer: " + (num1 + num2 + (hasNum3 ? num3 : 0)));
                        Console.WriteLine("-----------------------------");
                        break;

                    case "-":
                        Console.Write("Enter the " + nums[0] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num1))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[0] + " number: ");
                        }

                        Console.Write("Enter the " + nums[1] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num2))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[1] + " number: ");
                        }

                        Console.Write("Enter the " + nums[2] + " number: (optional, press Enter to skip): ");
                        input = Console.ReadLine();
                        if (!string.IsNullOrEmpty(input) && double.TryParse(input, out num3))
                        {
                            hasNum3 = true;
                        }

                        Console.WriteLine("-----------------------------");
                        Console.WriteLine("Answer: " + (num1 - num2 - (hasNum3 ? num3 : 0)));
                        Console.WriteLine("-----------------------------");
                        break;

                    case "*":
                        Console.Write("Enter the " + nums[0] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num1))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[0] + " number: ");
                        }

                        Console.Write("Enter the " + nums[1] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num2))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[1] + " number: ");
                        }

                        Console.Write("Enter the " + nums[2] + " number: (optional, press Enter to skip): ");
                        input = Console.ReadLine();
                        if (!string.IsNullOrEmpty(input) && double.TryParse(input, out num3))
                        {
                            hasNum3 = true;
                        }

                        Console.WriteLine("-----------------------------");
                        Console.WriteLine("Answer: " + (num1 * num2 * (hasNum3 ? num3 : 1)));
                        Console.WriteLine("-----------------------------");
                        break;

                    case "/":
                        Console.Write("Enter the " + nums[0] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num1))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[0] + " number: ");
                        }

                        Console.Write("Enter the " + nums[1] + " number: ");
                        while (!double.TryParse(Console.ReadLine(), out num2))
                        {
                            Console.WriteLine(invalid[0]);
                            Console.Write("Enter the " + nums[1] + " number: ");
                        }

                        if (num2 != 0)
                        {
                            Console.WriteLine("-----------------------------");
                            Console.WriteLine("Answer: " + (num1 / num2));
                            Console.WriteLine("-----------------------------");
                        }
                        else
                        {
                            Console.WriteLine("-----------------------------");
                            Console.WriteLine("Error: Division by zero is not allowed.");
                            Console.WriteLine("-----------------------------");
                        }
                        break;

                    default:
                        Console.WriteLine("Invalid choice. Please enter +, -, *, /, or q.");
                        break;
                }
            }

            Console.WriteLine("Calculator has been closed.");
        }
    }
}

using Csharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Csharp
{
    public interface IVehicle
    {
        void Drive();
    }
    public class Car : IVehicle
    {
        public void Drive()
        {
            Console.WriteLine("Driving the car!");
        }
    }

    public class Truck : IVehicle
    {
        public void Drive()
        {
            Console.WriteLine("Driving the truck!");
        }
    }
    public abstract class VehicleFactory
    {
        public abstract IVehicle CreateVehicle();

        public void DeliverVehicle()
        {
            IVehicle vehicle = CreateVehicle();
            Console.WriteLine("Factory created a vehicle.");
            vehicle.Drive();
        }
    }
    public class CarFactory : VehicleFactory
    {
        public override IVehicle CreateVehicle()
        {
            return new Car();
        }
    }

    public class TruckFactory : VehicleFactory
    {
        public override IVehicle CreateVehicle()
        {
            return new Truck();
        }
    }
    class ProgramGame
    {
        static void Main(string[] args)
        {
            VehicleFactory carFactory = new CarFactory();
            carFactory.DeliverVehicle();

            Console.WriteLine("---");

            VehicleFactory truckFactory = new TruckFactory();
            truckFactory.DeliverVehicle();
        }
    }
}

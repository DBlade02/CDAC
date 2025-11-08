using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet]
        public IActionResult Index()
        {
            var model = new Person
            {
                Name = "Aditya Mogre",
                Age = 23,
                College = "C-DAC"
            };

            return View(model);
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Index(Person model)
        {
            if (!ModelState.IsValid)
            {
                return View(model);
            }

            ViewData["SubmittedAt"] = System.DateTime.Now.ToString("g");

            return View(model);
        }
    }
}

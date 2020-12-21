using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace academicowebs.app
{
    public partial class agregar : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String sigla=TextBox1.Text;
            String nombre = TextBox2.Text;
            ServiceReference1.WebServiceSoapClient ws = new ServiceReference1.WebServiceSoapClient();
            ws.agregar(sigla,nombre);
        }
    }
}
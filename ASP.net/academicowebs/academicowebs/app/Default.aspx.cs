using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

namespace academicowebs.app
{
    public partial class _default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ServiceReference1.WebServiceSoapClient ws = new ServiceReference1.WebServiceSoapClient();
            GridView1.DataSource = ws.listar();
            GridView1.DataBind();
        }
        
    }
}
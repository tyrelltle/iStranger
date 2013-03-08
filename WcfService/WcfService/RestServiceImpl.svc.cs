using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfService
{
	// NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "RestServiceImpl" in code, svc and config file together.
	public class RestServiceImpl : IRestServiceImpl
	{
		public string XMLData(string id)
		{
			return "requested product" + id;
		}
		public string JSONData(string id)
		{
			return "requested product" + id;
		}
	}
}

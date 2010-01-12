class UrlMappings {
    static mappings = {
      "/$controller/$action?/$id?"{
	      constraints {
			 // apply constraints here
		  }
	  }
	  "/gadget"(view:"/gadget")
      "/"(view:"/index")
	  "500"(view:'/error')
	}
}

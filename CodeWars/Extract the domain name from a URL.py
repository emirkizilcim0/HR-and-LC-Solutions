def domain_name(url):
    if url[0:5] == "http:":
        url = url[7:]
    if url[0:5] == "https":
        url = url[8:] 
    if url [0:3] == "www":
        url = url[4:]
    indexOfCom = url.find(".")
    url = url[:indexOfCom]

    return url



if __name__ == '__main__':
    print(domain_name("http://github.com/carbonfive/raygun"))
    print(domain_name("http://www.zombie-bites.com"))
    print(domain_name("https://www.cnet.com"))
import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

url = "https://iaeme.com/Home/article_id/IJARET_16_02_019"

try:
    while True:
        # Set up the Chrome driver using webdriver-manager
        driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
        
        # Open the URL
        driver.get(url)
        
        # Wait for 5 seconds
        time.sleep(5)
        
        # Close the browser window
        driver.quit()
except KeyboardInterrupt:
    print("Loop terminated by user.")

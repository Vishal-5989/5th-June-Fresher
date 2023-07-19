import pandas as pd

df = pd.read_csv("errors.csv")

# df.to_csv("errors.csv",index = False)
# df.drop(["Unnamed: 8"], axis=0)
data_list = []

for row in df:
    if not row.startswith("Unnamed"):
        abcd = row.replace('"', "").split()
        for i in abcd:

            strip_row = i.strip()
    
            data_list.append(strip_row)
# data_list.remove('Unnamed: 8')
# print(data_list)
# data_list[3] = data_list[3].strip()
# errordata=data_list[3]

# print(errordata.replace('      ' ,','))

print(data_list)




fields = []
from datetime import datetime
now = datetime.now()
operations = {}
all_operations = []
game = True
print("John Deere Competition")
print("=======================")
while game:
    k = input("Enter Field, Operation, or Exit\n")
    if k == "Field":
        game_field = True
        while game_field:
            q = input("Enter Insert, Delete, Update, Display, Exit\n")
            if q == 'Insert':
                new_field = input("Enter Field Name\n")
                while new_field in fields:
                    print("Field already exists")
                    new_field = ("Enter Field Name\n")
                fields.append(new_field)
            if q == 'Delete':
                delete_field = input("Enter Field to be deleted\n")
                while new_field not in fields:
                    print("Field does not exist")
                    new_field = ("Enter Field to be deleted\n")
                fields.remove(delete_field)
            if q == 'Update':
                delete_field = input("Enter Field to be updated\n")
                while new_field not in fields:
                    print("Field does not exist")
                    delete_field = ("Enter Field to be updated\n")
                new_field_value = input("Enter updated Field name\n")
                fields.remove(delete_field)
                fields.append(new_field_value)
            if q == 'Display':
                print("The current Fields are")
                for i in fields:
                    print(i)
            if q == 'Exit':
                game_field = False
    if k == "Operation":
        operation_field = True
        while operation_field:
            q = input("Enter Insert, Delete, Update, Display, Exit\n")
            if q == 'Insert':
                new_field = input("Enter Field Name\n")
                while new_field not in fields:
                    print("Field already exists")
                    new_field = ("Enter Field Name\n")
                operation = input("Enter Seeding, Spraying, Tilling, Harvest\n")
                if operation == "Seeding":
                    type1 = input("Enter type of seed")
                elif operation == "Spraying":
                    type1 = input("Type of spray applied")
                elif operation == "Tilling":
                    type1 = input("Equipment of Tilling used")
                elif operation == "Harvest":
                    type1 = input("Equipment of Harvest used")
                current_time = now.strftime("%H:%M:%S")
                main_operation = [new_field, operation, current_time, type1]
                all_operations.append(main_operation)
            if q == 'Delete':
                delete_operation = input("Enter Operation to be deleted\n")
                delete_field = input("Enter field for the operation to be deleted from.")
                for i in all_operations:
                    if i[0] == delete_field and i[1] == delete_operation:
                        all_operations.delete(i)

            if q == 'Update':
                delete_field = input("Enter Field to be updated\n")
                while delete_field not in fields:
                    print("Field does not exist")
                    delete_operation = input("Enter operation to be updated\n")
                new_field_value = input("Enter updated Field name\n")
                for i in all_operations:
                    if i[0] == delete_field and i[1] == delete_operation:
                        i[1] = new_field_value
                        i[2] = now.strftime("%H:%M:%S")
            if q == 'Display':
                field_choice = input("Enter field to display")
                print("Operation", "Timestamp", "Type")
                print("============================")
                for i in all_operations:
                    if i[0] == field_choice:
                        print(i[1]+'   '+i[2]+'  ' + i[3])
                print("----------------------------")


                            
            if q == 'Exit':
                operation_field = False
    if k == "Exit":
        game = False
        print("Thank You for using the app.")
        
        
            
